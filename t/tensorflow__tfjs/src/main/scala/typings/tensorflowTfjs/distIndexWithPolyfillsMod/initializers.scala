package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjsLayers.distInitializersMod.ConstantArgs
import typings.tensorflowTfjsLayers.distInitializersMod.IdentityArgs
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.OrthogonalArgs
import typings.tensorflowTfjsLayers.distInitializersMod.RandomNormalArgs
import typings.tensorflowTfjsLayers.distInitializersMod.RandomUniformArgs
import typings.tensorflowTfjsLayers.distInitializersMod.SeedOnlyInitializerArgs
import typings.tensorflowTfjsLayers.distInitializersMod.TruncatedNormalArgs
import typings.tensorflowTfjsLayers.distInitializersMod.VarianceScalingArgs
import typings.tensorflowTfjsLayers.distInitializersMod.Zeros
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializers {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "initializers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def constant(args: ConstantArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def heNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def heUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def identity(args: IdentityArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def ones(): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[Initializer]
  
  inline def orthogonal(args: OrthogonalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("orthogonal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def randomNormal(args: RandomNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def randomUniform(args: RandomUniformArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def truncatedNormal(args: TruncatedNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def varianceScaling(config: VarianceScalingArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("varianceScaling")(config.asInstanceOf[js.Any]).asInstanceOf[Initializer]
  
  inline def zeros(): Zeros = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[Zeros]
}
