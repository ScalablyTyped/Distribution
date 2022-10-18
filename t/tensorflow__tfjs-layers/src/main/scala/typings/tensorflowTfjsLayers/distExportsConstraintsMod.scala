package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distConstraintsMod.MaxNormArgs
import typings.tensorflowTfjsLayers.distConstraintsMod.MinMaxNormArgs
import typings.tensorflowTfjsLayers.distConstraintsMod.UnitNormArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportsConstraintsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_constraints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxNorm(args: MaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("maxNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def minMaxNorm(config: MinMaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("minMaxNorm")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def nonNeg(): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNeg")().asInstanceOf[Constraint]
  
  inline def unitNorm(args: UnitNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("unitNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
}
