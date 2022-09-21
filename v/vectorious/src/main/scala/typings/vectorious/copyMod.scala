package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyMod {
  
  @JSImport("vectorious/dist/core/copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def copy(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def copy(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
