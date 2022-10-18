package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCorePushMod {
  
  @JSImport("vectorious/dist/core/push", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def push(x: ArrayLike[Any], value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def push(x: NDArray, value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
