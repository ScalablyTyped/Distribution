package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsLayers.regularizersMod.L1Args
import typings.tensorflowTfjsLayers.regularizersMod.L1L2Args
import typings.tensorflowTfjsLayers.regularizersMod.L2Args
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularizers {
  
  @JSImport("@tensorflow/tfjs", "regularizers")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def l1(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")().asInstanceOf[Regularizer]
  @scala.inline
  def l1(config: L1Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  
  @scala.inline
  def l1l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")().asInstanceOf[Regularizer]
  @scala.inline
  def l1l2(config: L1L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  
  @scala.inline
  def l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")().asInstanceOf[Regularizer]
  @scala.inline
  def l2(config: L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
}
