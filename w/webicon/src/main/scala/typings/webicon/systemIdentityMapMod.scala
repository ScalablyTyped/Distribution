package typings.webicon

import org.scalablytyped.runtime.StringDictionary
import typings.webicon.systemIdentifiableMod.Identifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemIdentityMapMod {
  
  type IdentityMap[TSimple, TComplex] = (js.Array[Identifiable & TComplex]) | (StringDictionary[TSimple | TComplex])
}
