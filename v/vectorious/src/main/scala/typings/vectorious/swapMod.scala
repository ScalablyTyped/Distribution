package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swapMod {
  
  @JSImport("vectorious/dist/core/swap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(i: Double, j: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def swap(x: ArrayLike[Any], i: Double, j: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def swap(x: NDArray, i: Double, j: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
