package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreReshapeMod {
  
  @JSImport("vectorious/dist/core/reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
  
  inline def reshape(x: ArrayLike[Any], shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(scala.List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NDArray]
  inline def reshape(x: NDArray, shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(scala.List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NDArray]
}
