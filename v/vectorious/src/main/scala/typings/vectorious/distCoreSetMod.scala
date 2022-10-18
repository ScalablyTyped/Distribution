package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSetMod {
  
  @JSImport("vectorious/dist/core/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def set(x: NDArray, args: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(scala.List(x.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
