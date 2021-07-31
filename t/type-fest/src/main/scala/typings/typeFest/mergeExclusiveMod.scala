package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeExclusiveMod {
  
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((Without[FirstType, SecondType]) & SecondType) | ((Without[SecondType, FirstType]) & FirstType)
  
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typings.typeFest.typeFestStrings.Without & TopLevel[js.Any]
}
