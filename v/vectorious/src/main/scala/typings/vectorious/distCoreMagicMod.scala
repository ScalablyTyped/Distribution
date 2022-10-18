package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMagicMod {
  
  @JSImport("vectorious/dist/core/magic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def magic(n: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("magic")(n.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
