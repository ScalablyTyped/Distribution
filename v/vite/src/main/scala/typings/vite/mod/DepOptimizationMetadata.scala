package typings.vite.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOptimizationMetadata extends StObject {
  
  /**
    * The browser hash is determined by the main hash plus additional dependencies
    * discovered at runtime. This is used to invalidate browser requests to
    * optimized deps.
    */
  var browserHash: String
  
  /**
    * Metadata for non-entry optimized chunks and dynamic imports
    */
  var chunks: Record[String, OptimizedDepInfo]
  
  /**
    * OptimizedDepInfo list
    */
  var depInfoList: js.Array[OptimizedDepInfo]
  
  /**
    * Metadata for each newly discovered dependency after processing
    */
  var discovered: Record[String, OptimizedDepInfo]
  
  /**
    * The main hash is determined by user config and dependency lockfiles.
    * This is checked on server startup to avoid unnecessary re-bundles.
    */
  var hash: String
  
  /**
    * Metadata for each already optimized dependency
    */
  var optimized: Record[String, OptimizedDepInfo]
}
object DepOptimizationMetadata {
  
  inline def apply(
    browserHash: String,
    chunks: Record[String, OptimizedDepInfo],
    depInfoList: js.Array[OptimizedDepInfo],
    discovered: Record[String, OptimizedDepInfo],
    hash: String,
    optimized: Record[String, OptimizedDepInfo]
  ): DepOptimizationMetadata = {
    val __obj = js.Dynamic.literal(browserHash = browserHash.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], depInfoList = depInfoList.asInstanceOf[js.Any], discovered = discovered.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], optimized = optimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepOptimizationMetadata]
  }
  
  extension [Self <: DepOptimizationMetadata](x: Self) {
    
    inline def setBrowserHash(value: String): Self = StObject.set(x, "browserHash", value.asInstanceOf[js.Any])
    
    inline def setChunks(value: Record[String, OptimizedDepInfo]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setDepInfoList(value: js.Array[OptimizedDepInfo]): Self = StObject.set(x, "depInfoList", value.asInstanceOf[js.Any])
    
    inline def setDepInfoListVarargs(value: OptimizedDepInfo*): Self = StObject.set(x, "depInfoList", js.Array(value*))
    
    inline def setDiscovered(value: Record[String, OptimizedDepInfo]): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setOptimized(value: Record[String, OptimizedDepInfo]): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
  }
}
