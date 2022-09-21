package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCompilationInfo extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUCompilationInfo
  
  val messages: js.Array[GPUCompilationMessage]
}
object GPUCompilationInfo {
  
  inline def apply(messages: js.Array[GPUCompilationMessage]): GPUCompilationInfo = {
    val __obj = js.Dynamic.literal(__brand = "GPUCompilationInfo", messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCompilationInfo]
  }
  
  extension [Self <: GPUCompilationInfo](x: Self) {
    
    inline def setMessages(value: js.Array[GPUCompilationMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: GPUCompilationMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUCompilationInfo): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
