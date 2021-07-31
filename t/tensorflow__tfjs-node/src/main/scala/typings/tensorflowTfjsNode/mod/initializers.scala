package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsLayers.initializersMod.ConstantArgs
import typings.tensorflowTfjsLayers.initializersMod.IdentityArgs
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.OrthogonalArgs
import typings.tensorflowTfjsLayers.initializersMod.RandomNormalArgs
import typings.tensorflowTfjsLayers.initializersMod.RandomUniformArgs
import typings.tensorflowTfjsLayers.initializersMod.SeedOnlyInitializerArgs
import typings.tensorflowTfjsLayers.initializersMod.TruncatedNormalArgs
import typings.tensorflowTfjsLayers.initializersMod.VarianceScalingArgs
import typings.tensorflowTfjsLayers.initializersMod.Zeros
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializers {
  
  @JSImport("@tensorflow/tfjs-node", "initializers")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def constant(args: ConstantArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def identity(args: IdentityArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def ones(): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[Initializer]
  
  @scala.inline
  def orthogonal(args: OrthogonalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("orthogonal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def randomNormal(args: RandomNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def randomUniform(args: RandomUniformArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def varianceScaling(config: VarianceScalingArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("varianceScaling")(config.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  @scala.inline
  def zeros(): Zeros = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[Zeros]
}
