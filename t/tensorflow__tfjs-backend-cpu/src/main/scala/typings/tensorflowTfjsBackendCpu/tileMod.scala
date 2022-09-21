package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsTileAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Tile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tile(args: AttrsTileAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("tile")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Tile", "tileConfig")
  @js.native
  val tileConfig: KernelConfig = js.native
}
