package typings.tsToolbelt

import typings.tsToolbelt.computeMod.ComputeRaw
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectOptionalMod.OptionalFlat
import typings.tsToolbelt.objectPickMod._Pick
import typings.tsToolbelt.objectRequiredMod.RequiredFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectAtLeastMod {
  
  type AtLeast[O /* <: js.Object */, K /* <: Key */] = _AtLeast[O, K]
  
  /**
    * @hidden
    */
  type RequiredIfKeys[O /* <: js.Object */, K /* <: Key */] = O | RequiredFlat[O]
  
  /**
    * @hidden
    */
  type _AtLeast[O /* <: js.Object */, K /* <: Key */] = ComputeRaw[__AtLeast[RequiredIfKeys[O, K], K]]
  
  /**
    * @hidden
    */
  type __AtLeast[O /* <: js.Object */, K /* <: Key */] = O | ((_Pick[O, K]) & OptionalFlat[O])
}
