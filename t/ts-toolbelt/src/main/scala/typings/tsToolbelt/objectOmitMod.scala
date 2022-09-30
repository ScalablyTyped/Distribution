package typings.tsToolbelt

import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectPickMod._Pick
import typings.tsToolbelt.unionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectOmitMod {
  
  type Omit[O /* <: js.Object */, K /* <: Key */] = _Omit[O, K]
  
  type _Omit[O /* <: js.Object */, K /* <: Key */] = _Pick[O, Exclude[/* keyof O */ String, K]]
}
