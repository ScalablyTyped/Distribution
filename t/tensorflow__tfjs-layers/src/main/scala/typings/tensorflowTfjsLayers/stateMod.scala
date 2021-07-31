package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNextUniqueTensorId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextUniqueTensorId")().asInstanceOf[Double]
  
  @scala.inline
  def getUid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")().asInstanceOf[String]
  @scala.inline
  def getUid(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
}
