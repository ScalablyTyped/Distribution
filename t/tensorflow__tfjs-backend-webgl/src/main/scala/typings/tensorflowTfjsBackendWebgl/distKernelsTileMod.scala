package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsTileAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTileMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Tile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tile(params: AttrsTileAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("tile")(params.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Tile", "tileConfig")
  @js.native
  val tileConfig: KernelConfig = js.native
}
