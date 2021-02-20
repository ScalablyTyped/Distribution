package typings.xhr2Cookies

import typings.xhr2Cookies.progressEventMod.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlHttpRequestEventTargetMod {
  
  @JSImport("xhr2-cookies/dist/xml-http-request-event-target", "XMLHttpRequestEventTarget")
  @js.native
  class XMLHttpRequestEventTarget () extends StObject {
    
    def addEventListener(eventType: String): Unit = js.native
    def addEventListener(eventType: String, listener: ProgressEventListenerOrEventListenerObject): Unit = js.native
    
    def dispatchEvent(event: ProgressEvent): Boolean = js.native
    
    var listeners: js.Any = js.native
    
    var onabort: ProgressEventListener | Null = js.native
    
    var onerror: ProgressEventListener | Null = js.native
    
    var onload: ProgressEventListener | Null = js.native
    
    var onloadend: ProgressEventListener | Null = js.native
    
    var onloadstart: ProgressEventListener | Null = js.native
    
    var onprogress: ProgressEventListener | Null = js.native
    
    var ontimeout: ProgressEventListener | Null = js.native
    
    def removeEventListener(eventType: String): Unit = js.native
    def removeEventListener(eventType: String, listener: ProgressEventListenerOrEventListenerObject): Unit = js.native
  }
  
  type ProgressEventListener = js.Function1[/* event */ ProgressEvent, Unit]
  
  @js.native
  trait ProgressEventListenerObject extends StObject {
    
    def handleEvent(event: ProgressEvent): Unit = js.native
  }
  object ProgressEventListenerObject {
    
    @scala.inline
    def apply(handleEvent: ProgressEvent => Unit): ProgressEventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ProgressEventListenerObject]
    }
    
    @scala.inline
    implicit class ProgressEventListenerObjectMutableBuilder[Self <: ProgressEventListenerObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleEvent(value: ProgressEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  type ProgressEventListenerOrEventListenerObject = ProgressEventListener | ProgressEventListenerObject
}
