package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSquareMod {
  
  @JSImport("vectorious/dist/core/square", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  inline def square(x: ArrayLike[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def square(x: NDArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
