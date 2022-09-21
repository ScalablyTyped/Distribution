package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferUsage extends StObject {
  
  val COPY_DST: GPUFlagsConstant
  
  val COPY_SRC: GPUFlagsConstant
  
  val INDEX: GPUFlagsConstant
  
  val INDIRECT: GPUFlagsConstant
  
  val MAP_READ: GPUFlagsConstant
  
  val MAP_WRITE: GPUFlagsConstant
  
  val QUERY_RESOLVE: GPUFlagsConstant
  
  val STORAGE: GPUFlagsConstant
  
  val UNIFORM: GPUFlagsConstant
  
  val VERTEX: GPUFlagsConstant
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUBufferUsage
}
object GPUBufferUsage {
  
  inline def apply(
    COPY_DST: GPUFlagsConstant,
    COPY_SRC: GPUFlagsConstant,
    INDEX: GPUFlagsConstant,
    INDIRECT: GPUFlagsConstant,
    MAP_READ: GPUFlagsConstant,
    MAP_WRITE: GPUFlagsConstant,
    QUERY_RESOLVE: GPUFlagsConstant,
    STORAGE: GPUFlagsConstant,
    UNIFORM: GPUFlagsConstant,
    VERTEX: GPUFlagsConstant
  ): GPUBufferUsage = {
    val __obj = js.Dynamic.literal(COPY_DST = COPY_DST.asInstanceOf[js.Any], COPY_SRC = COPY_SRC.asInstanceOf[js.Any], INDEX = INDEX.asInstanceOf[js.Any], INDIRECT = INDIRECT.asInstanceOf[js.Any], MAP_READ = MAP_READ.asInstanceOf[js.Any], MAP_WRITE = MAP_WRITE.asInstanceOf[js.Any], QUERY_RESOLVE = QUERY_RESOLVE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], UNIFORM = UNIFORM.asInstanceOf[js.Any], VERTEX = VERTEX.asInstanceOf[js.Any], __brand = "GPUBufferUsage")
    __obj.asInstanceOf[GPUBufferUsage]
  }
  
  extension [Self <: GPUBufferUsage](x: Self) {
    
    inline def setCOPY_DST(value: GPUFlagsConstant): Self = StObject.set(x, "COPY_DST", value.asInstanceOf[js.Any])
    
    inline def setCOPY_SRC(value: GPUFlagsConstant): Self = StObject.set(x, "COPY_SRC", value.asInstanceOf[js.Any])
    
    inline def setINDEX(value: GPUFlagsConstant): Self = StObject.set(x, "INDEX", value.asInstanceOf[js.Any])
    
    inline def setINDIRECT(value: GPUFlagsConstant): Self = StObject.set(x, "INDIRECT", value.asInstanceOf[js.Any])
    
    inline def setMAP_READ(value: GPUFlagsConstant): Self = StObject.set(x, "MAP_READ", value.asInstanceOf[js.Any])
    
    inline def setMAP_WRITE(value: GPUFlagsConstant): Self = StObject.set(x, "MAP_WRITE", value.asInstanceOf[js.Any])
    
    inline def setQUERY_RESOLVE(value: GPUFlagsConstant): Self = StObject.set(x, "QUERY_RESOLVE", value.asInstanceOf[js.Any])
    
    inline def setSTORAGE(value: GPUFlagsConstant): Self = StObject.set(x, "STORAGE", value.asInstanceOf[js.Any])
    
    inline def setUNIFORM(value: GPUFlagsConstant): Self = StObject.set(x, "UNIFORM", value.asInstanceOf[js.Any])
    
    inline def setVERTEX(value: GPUFlagsConstant): Self = StObject.set(x, "VERTEX", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUBufferUsage): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
