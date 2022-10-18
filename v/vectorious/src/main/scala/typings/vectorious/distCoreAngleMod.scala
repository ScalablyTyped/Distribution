package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreAngleMod {
  
  @JSImport("vectorious/dist/core/angle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def angle(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: ArrayLike[Any], y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: NDArray, y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
