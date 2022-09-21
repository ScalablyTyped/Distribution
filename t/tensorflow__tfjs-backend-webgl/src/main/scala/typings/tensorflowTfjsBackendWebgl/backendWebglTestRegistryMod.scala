package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsCore.jasmineUtilMod.Constraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendWebglTestRegistryMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl_test_registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl_test_registry", "PACKED_ENVS")
  @js.native
  val PACKED_ENVS: Constraints = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl_test_registry", "WEBGL_ENVS")
  @js.native
  val WEBGL_ENVS: Constraints = js.native
  
  inline def registerTestEnvs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTestEnvs")().asInstanceOf[Unit]
}
