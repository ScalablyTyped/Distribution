package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendStateMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextUniqueTensorId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextUniqueTensorId")().asInstanceOf[Double]
  
  inline def getUid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")().asInstanceOf[String]
  inline def getUid(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
}
