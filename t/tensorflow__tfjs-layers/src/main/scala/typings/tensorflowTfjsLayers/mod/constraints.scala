package typings.tensorflowTfjsLayers.mod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers", "constraints")
@js.native
object constraints extends js.Object {
  
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  
  def nonNeg(): Constraint = js.native
  
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}
