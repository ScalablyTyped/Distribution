package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectPickMod {
  
  type Pick[O /* <: js.Object */, K /* <: Key */] = _Pick[O, K]
  
  type _Pick[O /* <: js.Object */, K /* <: Key */] = __Pick[O, (/* keyof O */ String) & K]
  
  /**
    * @hidden
    */
  type __Pick[O /* <: js.Object */, K /* <: /* keyof O */ String */] = typings.tsToolbelt.tsToolbeltStrings.__Pick & TopLevel[O] & js.Object
}
