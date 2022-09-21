package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotMod {
  
  @JSImport("vectorious/dist/core/dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def dot(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: ArrayLike[Any], y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: NDArray, y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
