package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def epsilon(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epsilon")().asInstanceOf[Double]
  
  @scala.inline
  def imageDataFormat(): DataFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDataFormat")().asInstanceOf[DataFormat]
  
  @scala.inline
  def setEpsilon(e: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEpsilon")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
