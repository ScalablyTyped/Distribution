package typings.tensorflowTfjsLayers.convolutionalRecurrentMod

import typings.tensorflowTfjsLayers.activationsMod.Activation
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.recurrentMod.RNNCell
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvRNN2DCell extends RNNCell {
  
  val activation: Activation = js.native
  
  val biasConstraint: Constraint = js.native
  
  val biasInitializer: Initializer = js.native
  
  val biasRegularizer: Regularizer = js.native
  
  val dataFormat: DataFormat = js.native
  
  val dilationRate: js.Array[Double] = js.native
  
  val dropout: Double = js.native
  
  val filters: Double = js.native
  
  val kernelConstraint: Constraint = js.native
  
  val kernelInitializer: Initializer = js.native
  
  val kernelRegularizer: Regularizer = js.native
  
  val kernelSize: js.Array[Double] = js.native
  
  val padding: PaddingMode = js.native
  
  val recurrentConstraint: Constraint = js.native
  
  val recurrentDropout: Double = js.native
  
  val recurrentInitializer: Initializer = js.native
  
  val recurrentRegularizer: Regularizer = js.native
  
  val strides: js.Array[Double] = js.native
  
  val useBias: Boolean = js.native
}
