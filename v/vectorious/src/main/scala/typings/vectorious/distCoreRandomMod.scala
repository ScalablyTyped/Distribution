package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRandomMod {
  
  @JSImport("vectorious/dist/core/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def random(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
