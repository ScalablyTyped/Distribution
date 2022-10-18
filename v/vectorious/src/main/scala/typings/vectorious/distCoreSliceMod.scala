package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSliceMod {
  
  @JSImport("vectorious/dist/core/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  inline def default(begin: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def default(begin: Double, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(begin: Double, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(begin: Double, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(begin: Unit, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(begin: Unit, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def default(begin: Unit, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def slice(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
