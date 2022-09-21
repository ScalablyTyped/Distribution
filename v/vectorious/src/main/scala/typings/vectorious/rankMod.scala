package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rankMod {
  
  @JSImport("vectorious/dist/core/rank", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  inline def default(tolerance: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tolerance.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rank(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: ArrayLike[Any], tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rank(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: NDArray, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
}
