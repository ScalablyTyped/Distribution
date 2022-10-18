package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsScalarMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scalar(value: String): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: String, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: js.typedarray.Uint8Array): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: Boolean): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: Boolean, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: Double): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: Double, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
}
