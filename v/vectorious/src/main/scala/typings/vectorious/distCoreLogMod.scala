package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreLogMod {
  
  @JSImport("vectorious/dist/core/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def log(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
