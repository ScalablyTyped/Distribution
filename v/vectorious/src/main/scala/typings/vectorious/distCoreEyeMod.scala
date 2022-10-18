package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreEyeMod {
  
  @JSImport("vectorious/dist/core/eye", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eye(n: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")(n.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
