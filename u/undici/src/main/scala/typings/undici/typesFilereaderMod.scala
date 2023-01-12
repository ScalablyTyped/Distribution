package typings.undici

import typings.std.Blob
import typings.std.DOMException
import typings.std.Event
import typings.std.EventInit
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFilereaderMod {
  
  @JSImport("undici/types/filereader", "FileReader")
  @js.native
  open class FileReader ()
    extends StObject
       with EventTarget {
    
    val DONE: /* 2 */ Double = js.native
    
    val EMPTY: /* 0 */ Double = js.native
    
    val LOADING: /* 1 */ Double = js.native
    
    def abort(): Unit = js.native
    
    val error: DOMException | Null = js.native
    
    var onabort: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    var onerror: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    var onload: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    var onloadend: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    var onloadstart: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    var onprogress: Null | (js.ThisFunction1[/* this */ this.type, /* event */ ProgressEvent, Unit]) = js.native
    
    def readAsArrayBuffer(blob: Blob): Unit = js.native
    
    def readAsBinaryString(blob: Blob): Unit = js.native
    
    def readAsDataURL(blob: Blob): Unit = js.native
    
    def readAsText(blob: Blob): Unit = js.native
    def readAsText(blob: Blob, encoding: String): Unit = js.native
    
    val readyState: Double = js.native
    
    val result: String | js.typedarray.ArrayBuffer | Null = js.native
  }
  /* static members */
  object FileReader {
    
    @JSImport("undici/types/filereader", "FileReader.DONE")
    @js.native
    val DONE: /* 2 */ Double = js.native
    
    @JSImport("undici/types/filereader", "FileReader.EMPTY")
    @js.native
    val EMPTY: /* 0 */ Double = js.native
    
    @JSImport("undici/types/filereader", "FileReader.LOADING")
    @js.native
    val LOADING: /* 1 */ Double = js.native
  }
  
  @JSImport("undici/types/filereader", "ProgressEvent")
  @js.native
  open class ProgressEvent protected ()
    extends StObject
       with Event {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: ProgressEventInit) = this()
    
    val lengthComputable: Boolean = js.native
    
    val loaded: Double = js.native
    
    val total: Double = js.native
  }
  
  trait ProgressEventInit
    extends StObject
       with EventInit {
    
    var lengthComputable: js.UndefOr[Boolean] = js.undefined
    
    var loaded: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object ProgressEventInit {
    
    inline def apply(): ProgressEventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressEventInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressEventInit] (val x: Self) extends AnyVal {
      
      inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      inline def setLengthComputableUndefined: Self = StObject.set(x, "lengthComputable", js.undefined)
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
