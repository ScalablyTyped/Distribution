package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLocalResponseNormalizationMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/local_response_normalization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
}
