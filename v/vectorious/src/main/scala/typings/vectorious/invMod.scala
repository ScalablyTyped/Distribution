package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invMod {
  
  @JSImport("vectorious/dist/core/inv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def inv(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def inv(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
