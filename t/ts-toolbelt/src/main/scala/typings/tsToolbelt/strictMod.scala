package typings.tsToolbelt

import typings.std.Exclude
import typings.tsToolbelt.computeMod.ComputeRaw
import typings.tsToolbelt.keysMod.Keys
import typings.tsToolbelt.objectOptionalMod.OptionalFlat
import typings.tsToolbelt.objectRecordMod.Record
import typings.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typings.tsToolbelt.tsToolbeltStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictMod {
  
  type Strict[U /* <: js.Object */] = ComputeRaw[_Strict[U, U]]
  
  /**
    * @hidden
    */
  type _Strict[U, _U] = U & (OptionalFlat[
    Record[
      Exclude[Keys[_U], /* keyof U */ String], 
      scala.Nothing, 
      js.Tuple2[Exclamationmark, W]
    ]
  ])
}
