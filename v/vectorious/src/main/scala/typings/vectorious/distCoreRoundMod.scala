package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRoundMod {
  
  @JSImport("vectorious/dist/core/round", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def round(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def round(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
