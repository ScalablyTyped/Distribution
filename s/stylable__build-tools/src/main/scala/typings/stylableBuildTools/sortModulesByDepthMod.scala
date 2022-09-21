package typings.stylableBuildTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortModulesByDepthMod {
  
  @JSImport("@stylable/build-tools/dist/sort-modules-by-depth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sortModulesByDepth[T](
    modules: js.Array[T],
    getDepth: js.Function1[/* m */ T, Double],
    getID: js.Function1[/* m */ T, String]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortModulesByDepth")(modules.asInstanceOf[js.Any], getDepth.asInstanceOf[js.Any], getID.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def sortModulesByDepth[T](
    modules: js.Array[T],
    getDepth: js.Function1[/* m */ T, Double],
    getID: js.Function1[/* m */ T, String],
    factor: Double
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortModulesByDepth")(modules.asInstanceOf[js.Any], getDepth.asInstanceOf[js.Any], getID.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
