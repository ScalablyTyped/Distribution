package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModule
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUShaderModule
  
  /**
    * Returns any messages generated during the {@link GPUShaderModule}'s compilation.
    * The locations, order, and contents of messages are implementation-defined.
    * In particular, messages may not be ordered by {@link GPUCompilationMessage#lineNum}.
    */
  def compilationInfo(): js.Promise[GPUCompilationInfo]
}
object GPUShaderModule {
  
  inline def apply(compilationInfo: () => js.Promise[GPUCompilationInfo], label: String): GPUShaderModule = {
    val __obj = js.Dynamic.literal(__brand = "GPUShaderModule", compilationInfo = js.Any.fromFunction0(compilationInfo), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUShaderModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUShaderModule] (val x: Self) extends AnyVal {
    
    inline def setCompilationInfo(value: () => js.Promise[GPUCompilationInfo]): Self = StObject.set(x, "compilationInfo", js.Any.fromFunction0(value))
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUShaderModule): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
