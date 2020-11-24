package typings.tensorflowTfjsBackendWebgl.kernelFuncsUtilsMod

import typings.tensorflowTfjsBackendWebgl.sharedMod.SimpleBinaryKernelImplCPU
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryKernelFuncConfig extends js.Object {
  
  var checkOutOfBounds: js.UndefOr[Boolean] = js.native
  
  var cpuKernelImpl: js.UndefOr[SimpleBinaryKernelImplCPU] = js.native
  
  var dtype: js.UndefOr[DataType] = js.native
  
  var opSnippet: String = js.native
  
  var packedOpSnippet: js.UndefOr[String] = js.native
  
  var supportsComplex: js.UndefOr[Boolean] = js.native
}
object BinaryKernelFuncConfig {
  
  @scala.inline
  def apply(opSnippet: String): BinaryKernelFuncConfig = {
    val __obj = js.Dynamic.literal(opSnippet = opSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryKernelFuncConfig]
  }
  
  @scala.inline
  implicit class BinaryKernelFuncConfigOps[Self <: BinaryKernelFuncConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpSnippet(value: String): Self = this.set("opSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOutOfBounds(value: Boolean): Self = this.set("checkOutOfBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOutOfBounds: Self = this.set("checkOutOfBounds", js.undefined)
    
    @scala.inline
    def setCpuKernelImpl(
      value: (/* aShape */ js.Array[Double], /* bShape */ js.Array[Double], /* aVals */ TypedArray, /* bVals */ TypedArray, /* dtype */ DataType) => js.Tuple2[TypedArray, js.Array[Double]]
    ): Self = this.set("cpuKernelImpl", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteCpuKernelImpl: Self = this.set("cpuKernelImpl", js.undefined)
    
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    
    @scala.inline
    def setPackedOpSnippet(value: String): Self = this.set("packedOpSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackedOpSnippet: Self = this.set("packedOpSnippet", js.undefined)
    
    @scala.inline
    def setSupportsComplex(value: Boolean): Self = this.set("supportsComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsComplex: Self = this.set("supportsComplex", js.undefined)
  }
}
