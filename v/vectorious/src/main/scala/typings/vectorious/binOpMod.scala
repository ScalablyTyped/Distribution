package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binOpMod {
  
  @JSImport("vectorious/dist/core/binOp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: ArrayLike[Any], f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(x: NDArray, f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def binOp(
    x: ArrayLike[Any],
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: ArrayLike[Any],
    y: NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: NDArray,
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: NDArray,
    y: NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
