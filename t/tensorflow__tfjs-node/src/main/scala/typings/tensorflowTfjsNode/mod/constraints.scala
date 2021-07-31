package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraints {
  
  @JSImport("@tensorflow/tfjs-node", "constraints")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def maxNorm(args: MaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("maxNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  @scala.inline
  def minMaxNorm(config: MinMaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("minMaxNorm")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  @scala.inline
  def nonNeg(): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNeg")().asInstanceOf[Constraint]
  
  @scala.inline
  def unitNorm(args: UnitNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("unitNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
}
