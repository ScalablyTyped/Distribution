package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the disk usage statistics for this collection. */
trait CollectionDiskUsage extends StObject {
  
  /** Number of bytes used by the collection. */
  var used_bytes: js.UndefOr[Double] = js.undefined
}
object CollectionDiskUsage {
  
  inline def apply(): CollectionDiskUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDiskUsage]
  }
  
  extension [Self <: CollectionDiskUsage](x: Self) {
    
    inline def setUsed_bytes(value: Double): Self = StObject.set(x, "used_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsed_bytesUndefined: Self = StObject.set(x, "used_bytes", js.undefined)
  }
}
