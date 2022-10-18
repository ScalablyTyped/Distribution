package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMatrixMod {
  
  @JSImport("vectorious/dist/core/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matrix(r: Double, c: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(r.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
