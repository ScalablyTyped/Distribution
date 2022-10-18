package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreTraceMod {
  
  @JSImport("vectorious/dist/core/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  
  inline def trace(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def trace(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
