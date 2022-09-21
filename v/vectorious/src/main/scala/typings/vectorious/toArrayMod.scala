package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.coreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toArrayMod {
  
  @JSImport("vectorious/dist/core/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(index: Double, dim: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(index.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(index: Unit, dim: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(index.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toArray(x: ArrayLike[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toArray(x: NDArray): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
}
