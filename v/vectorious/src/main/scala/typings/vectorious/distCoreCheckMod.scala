package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCheckMod {
  
  @JSImport("vectorious/dist/core/check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(indices.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def check(x: ArrayLike[Any], indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(scala.List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def check(x: NDArray, indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(scala.List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
