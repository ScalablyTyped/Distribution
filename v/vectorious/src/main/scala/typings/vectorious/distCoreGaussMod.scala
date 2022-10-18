package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreGaussMod {
  
  @JSImport("vectorious/dist/core/gauss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def gauss(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def gauss(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
