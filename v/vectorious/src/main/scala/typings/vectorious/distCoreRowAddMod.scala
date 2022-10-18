package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreRowAddMod {
  
  @JSImport("vectorious/dist/core/row_add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dest: Double, source: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(dest: Double, source: Double, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: NDArray, dest: Double, source: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: NDArray, dest: Double, source: Double, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
