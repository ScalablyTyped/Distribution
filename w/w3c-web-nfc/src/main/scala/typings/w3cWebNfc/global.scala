package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("NDEFMessage")
  @js.native
  open class NDEFMessage protected ()
    extends StObject
       with typings.w3cWebNfc.NDEFMessage {
    def this(messageInit: NDEFMessageInit) = this()
    
    /* CompleteClass */
    var records: js.Array[typings.w3cWebNfc.NDEFRecord] = js.native
  }
  
  @JSGlobal("NDEFReader")
  @js.native
  open class NDEFReader ()
    extends StObject
       with typings.w3cWebNfc.NDEFReader
  
  @JSGlobal("NDEFReadingEvent")
  @js.native
  open class NDEFReadingEvent protected ()
    extends StObject
       with typings.w3cWebNfc.NDEFReadingEvent {
    def this(`type`: String, readingEventInitDict: NDEFReadingEventInit) = this()
  }
  
  @JSGlobal("NDEFRecord")
  @js.native
  open class NDEFRecord protected ()
    extends StObject
       with typings.w3cWebNfc.NDEFRecord {
    def this(recordInit: NDEFRecordInit) = this()
    
    /* CompleteClass */
    override val recordType: String = js.native
  }
}
