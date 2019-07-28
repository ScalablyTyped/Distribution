package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashLayers.distInitializersMod.ConstantArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.IdentityArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.OrthogonalArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.RandomNormalArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.RandomUniformArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.SeedOnlyInitializerArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.TruncatedNormalArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.VarianceScalingArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Zeros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "initializers")
@js.native
object initializersNs extends js.Object {
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

