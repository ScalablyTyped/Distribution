package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCompilationMessage extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUCompilationMessage
  
  /**
    * The number of UTF-16 code units in the substring that {@link GPUCompilationMessage#message}
    * corresponds to. If the message does not correspond with a substring then
    * {@link GPUCompilationMessage#length} must be 0.
    */
  val length: Double
  
  /**
    * The line number in the shader {@link GPUShaderModuleDescriptor#code} the
    * {@link GPUCompilationMessage#message} corresponds to. Value is one-based, such that a lineNum of
    * `1` indicates the first line of the shader {@link GPUShaderModuleDescriptor#code}.
    * If the {@link GPUCompilationMessage#message} corresponds to a substring this points to
    * the line on which the substring begins. Must be `0` if the {@link GPUCompilationMessage#message}
    * does not correspond to any specific point in the shader {@link GPUShaderModuleDescriptor#code}.
    * Issue(gpuweb/gpuweb#2435): Reference WGSL spec when it [defines what a line is](https://gpuweb.github.io/gpuweb/wgsl/#comments).
    */
  val lineNum: Double
  
  /**
    * The offset, in UTF-16 code units, from the beginning of line {@link GPUCompilationMessage#lineNum}
    * of the shader {@link GPUShaderModuleDescriptor#code} to the point or beginning of the substring
    * that the {@link GPUCompilationMessage#message} corresponds to. Value is one-based, such that a
    * {@link GPUCompilationMessage#linePos} of `1` indicates the first code unit of the line.
    * If {@link GPUCompilationMessage#message} corresponds to a substring this points to the
    * first UTF-16 code unit of the substring. Must be `0` if the {@link GPUCompilationMessage#message}
    * does not correspond to any specific point in the shader {@link GPUShaderModuleDescriptor#code}.
    */
  val linePos: Double
  
  /**
    * A human-readable string containing the message generated during the shader compilation.
    */
  val message: String
  
  /**
    * The offset from the beginning of the shader {@link GPUShaderModuleDescriptor#code} in UTF-16
    * code units to the point or beginning of the substring that {@link GPUCompilationMessage#message}
    * corresponds to. Must reference the same position as {@link GPUCompilationMessage#lineNum} and
    * {@link GPUCompilationMessage#linePos}. Must be `0` if the {@link GPUCompilationMessage#message}
    * does not correspond to any specific point in the shader {@link GPUShaderModuleDescriptor#code}.
    */
  val offset: Double
  
  /**
    * The severity level of the message.
    * If the {@link GPUCompilationMessage#type} is "error", it corresponds to a
    * shader-creation error.
    */
  val `type`: GPUCompilationMessageType
}
object GPUCompilationMessage {
  
  inline def apply(
    length: Double,
    lineNum: Double,
    linePos: Double,
    message: String,
    offset: Double,
    `type`: GPUCompilationMessageType
  ): GPUCompilationMessage = {
    val __obj = js.Dynamic.literal(__brand = "GPUCompilationMessage", length = length.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], linePos = linePos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCompilationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUCompilationMessage] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLineNum(value: Double): Self = StObject.set(x, "lineNum", value.asInstanceOf[js.Any])
    
    inline def setLinePos(value: Double): Self = StObject.set(x, "linePos", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: GPUCompilationMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUCompilationMessage): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
