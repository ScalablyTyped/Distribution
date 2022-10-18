package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreAddMod {
  
  @JSImport("vectorious/dist/core/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def default(x: ArrayLike[Any], alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def default(x: NDArray, alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any], alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: NDArray, alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: ArrayLike[Any], alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: NDArray, alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
