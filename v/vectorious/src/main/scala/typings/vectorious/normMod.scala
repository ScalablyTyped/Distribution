package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normMod {
  
  @JSImport("vectorious/dist/core/norm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  
  inline def norm(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def norm(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
