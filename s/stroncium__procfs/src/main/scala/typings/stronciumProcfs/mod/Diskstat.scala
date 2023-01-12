package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diskstat extends StObject {
  
  var currentIoCount: Double
  
  var devId: Double
  
  var ioTime: Double
  
  var name: String
  
  var readTime: Double
  
  var reads: Double
  
  var readsMerged: Double
  
  var sectorsRead: Double
  
  var sectorsWritten: Double
  
  var weightedIoTime: Double
  
  var writeTime: Double
  
  var writes: Double
  
  var writesMerged: Double
}
object Diskstat {
  
  inline def apply(
    currentIoCount: Double,
    devId: Double,
    ioTime: Double,
    name: String,
    readTime: Double,
    reads: Double,
    readsMerged: Double,
    sectorsRead: Double,
    sectorsWritten: Double,
    weightedIoTime: Double,
    writeTime: Double,
    writes: Double,
    writesMerged: Double
  ): Diskstat = {
    val __obj = js.Dynamic.literal(currentIoCount = currentIoCount.asInstanceOf[js.Any], devId = devId.asInstanceOf[js.Any], ioTime = ioTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any], readsMerged = readsMerged.asInstanceOf[js.Any], sectorsRead = sectorsRead.asInstanceOf[js.Any], sectorsWritten = sectorsWritten.asInstanceOf[js.Any], weightedIoTime = weightedIoTime.asInstanceOf[js.Any], writeTime = writeTime.asInstanceOf[js.Any], writes = writes.asInstanceOf[js.Any], writesMerged = writesMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diskstat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diskstat] (val x: Self) extends AnyVal {
    
    inline def setCurrentIoCount(value: Double): Self = StObject.set(x, "currentIoCount", value.asInstanceOf[js.Any])
    
    inline def setDevId(value: Double): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setIoTime(value: Double): Self = StObject.set(x, "ioTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: Double): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    
    inline def setReadsMerged(value: Double): Self = StObject.set(x, "readsMerged", value.asInstanceOf[js.Any])
    
    inline def setSectorsRead(value: Double): Self = StObject.set(x, "sectorsRead", value.asInstanceOf[js.Any])
    
    inline def setSectorsWritten(value: Double): Self = StObject.set(x, "sectorsWritten", value.asInstanceOf[js.Any])
    
    inline def setWeightedIoTime(value: Double): Self = StObject.set(x, "weightedIoTime", value.asInstanceOf[js.Any])
    
    inline def setWriteTime(value: Double): Self = StObject.set(x, "writeTime", value.asInstanceOf[js.Any])
    
    inline def setWrites(value: Double): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesMerged(value: Double): Self = StObject.set(x, "writesMerged", value.asInstanceOf[js.Any])
  }
}
