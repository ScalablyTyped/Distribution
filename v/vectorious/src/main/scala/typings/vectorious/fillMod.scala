package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillMod {
  
  @JSImport("vectorious/dist/core/fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  inline def default(value: js.Function1[/* index */ Double, Double]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def default(value: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def fill(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def fill(x: ArrayLike[Any], value: js.Function1[/* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: ArrayLike[Any], value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def fill(x: NDArray, value: js.Function1[/* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: NDArray, value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
