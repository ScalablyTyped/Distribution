package typings.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YArray")
@js.native
open class YArray[T] ()
  extends typings.yjs.distSrcTypesYarrayMod.YArray[T]
/* static members */
object YArray {
  
  @JSImport("yjs/dist/src/internals", "YArray")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Construct a new YArray containing the specified items.
    * @template {Object<string,any>|Array<any>|number|null|string|Uint8Array} T
    * @param {Array<T>} items
    * @return {YArray<T>}
    */
  inline def from[T_1 /* <: String | Double | js.Array[Any] | js.typedarray.Uint8Array | StringDictionary[Any] | Null */](items: js.Array[T_1]): typings.yjs.distSrcTypesYarrayMod.YArray[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[typings.yjs.distSrcTypesYarrayMod.YArray[T_1]]
}
