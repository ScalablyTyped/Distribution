package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.computeMod.ComputeRaw
import typings.tsToolbelt.intersectOfMod.IntersectOf
import typings.tsToolbelt.objectOverwriteMod.Overwrite
import typings.tsToolbelt.strictMod.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionMergeMod {
  
  type Merge[U /* <: js.Object */] = ComputeRaw[_Merge[Strict[U]]]
  
  /**
    * @hidden
    */
  type _Merge[U /* <: js.Object */] = IntersectOf[
    Overwrite[
      U, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof U ]: -? ts-toolbelt.ts-toolbelt/out/Any/At.At<U, K>}
    */ typings.tsToolbelt.tsToolbeltStrings._Merge & TopLevel[Any]
    ]
  ]
}
