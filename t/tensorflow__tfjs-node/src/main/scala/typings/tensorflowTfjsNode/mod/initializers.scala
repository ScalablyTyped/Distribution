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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "initializers")
@js.native
object initializers extends js.Object {
  def constant(args: ConstantArgs): Initializer = js.native
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def identity(args: IdentityArgs): Initializer = js.native
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def ones(): Initializer = js.native
  def orthogonal(args: OrthogonalArgs): Initializer = js.native
  def randomNormal(args: RandomNormalArgs): Initializer = js.native
  def randomUniform(args: RandomUniformArgs): Initializer = js.native
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
  def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
  def zeros(): Zeros = js.native
}

