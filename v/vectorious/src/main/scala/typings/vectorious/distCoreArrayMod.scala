package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreArrayMod {
  
  @JSImport("vectorious/dist/core/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array(args: Any*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
