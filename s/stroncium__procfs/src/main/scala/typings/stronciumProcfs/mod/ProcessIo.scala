package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessIo extends StObject {
  
  var read: Double
  
  var readReal: Double
  
  var readSyscalls: Double
  
  var write: Double
  
  var writeCancelled: Double
  
  var writeReal: Double
  
  var writeSyscalls: Double
}
object ProcessIo {
  
  inline def apply(
    read: Double,
    readReal: Double,
    readSyscalls: Double,
    write: Double,
    writeCancelled: Double,
    writeReal: Double,
    writeSyscalls: Double
  ): ProcessIo = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], readReal = readReal.asInstanceOf[js.Any], readSyscalls = readSyscalls.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writeCancelled = writeCancelled.asInstanceOf[js.Any], writeReal = writeReal.asInstanceOf[js.Any], writeSyscalls = writeSyscalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessIo]
  }
  
  extension [Self <: ProcessIo](x: Self) {
    
    inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadReal(value: Double): Self = StObject.set(x, "readReal", value.asInstanceOf[js.Any])
    
    inline def setReadSyscalls(value: Double): Self = StObject.set(x, "readSyscalls", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Double): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteCancelled(value: Double): Self = StObject.set(x, "writeCancelled", value.asInstanceOf[js.Any])
    
    inline def setWriteReal(value: Double): Self = StObject.set(x, "writeReal", value.asInstanceOf[js.Any])
    
    inline def setWriteSyscalls(value: Double): Self = StObject.set(x, "writeSyscalls", value.asInstanceOf[js.Any])
  }
}
