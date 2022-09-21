package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equilateralMod {
  
  @JSImport("vectorious/dist/core/equilateral", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: NDArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def equilateral(x: ArrayLike[Any], y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: ArrayLike[Any], y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: NDArray, y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: NDArray, y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
