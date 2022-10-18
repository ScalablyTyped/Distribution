package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMeanMod {
  
  @JSImport("vectorious/dist/core/mean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  
  inline def mean(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mean(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
