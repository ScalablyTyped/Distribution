package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRangeMod {
  
  @JSImport("vectorious/dist/core/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(args: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
