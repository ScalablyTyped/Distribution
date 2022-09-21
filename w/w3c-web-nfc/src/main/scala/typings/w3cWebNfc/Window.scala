package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var NDEFMessage: typings.w3cWebNfc.NDEFMessage
  
  var NDEFReader: typings.w3cWebNfc.NDEFReader
  
  var NDEFReadingEvent: typings.w3cWebNfc.NDEFReadingEvent
  
  var NDEFRecord: typings.w3cWebNfc.NDEFRecord
}
object Window {
  
  inline def apply(
    NDEFMessage: NDEFMessage,
    NDEFReader: NDEFReader,
    NDEFReadingEvent: NDEFReadingEvent,
    NDEFRecord: NDEFRecord
  ): Window = {
    val __obj = js.Dynamic.literal(NDEFMessage = NDEFMessage.asInstanceOf[js.Any], NDEFReader = NDEFReader.asInstanceOf[js.Any], NDEFReadingEvent = NDEFReadingEvent.asInstanceOf[js.Any], NDEFRecord = NDEFRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setNDEFMessage(value: NDEFMessage): Self = StObject.set(x, "NDEFMessage", value.asInstanceOf[js.Any])
    
    inline def setNDEFReader(value: NDEFReader): Self = StObject.set(x, "NDEFReader", value.asInstanceOf[js.Any])
    
    inline def setNDEFReadingEvent(value: NDEFReadingEvent): Self = StObject.set(x, "NDEFReadingEvent", value.asInstanceOf[js.Any])
    
    inline def setNDEFRecord(value: NDEFRecord): Self = StObject.set(x, "NDEFRecord", value.asInstanceOf[js.Any])
  }
}
