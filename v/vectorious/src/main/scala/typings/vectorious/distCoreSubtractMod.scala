package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSubtractMod {
  
  @JSImport("vectorious/dist/core/subtract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def subtract(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
