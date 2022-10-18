package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendCommonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def epsilon(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epsilon")().asInstanceOf[Double]
  
  inline def imageDataFormat(): DataFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDataFormat")().asInstanceOf[DataFormat]
  
  inline def setEpsilon(e: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEpsilon")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
