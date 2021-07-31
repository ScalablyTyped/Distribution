package typings.syncRequest

import typings.node.Buffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formDataMod {
  
  @JSImport("sync-request/lib/FormData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sync-request/lib/FormData", "FormData")
  @js.native
  class FormData () extends StObject {
    
    var _entries: js.Any = js.native
    
    def append(key: String, value: String): Unit = js.native
    def append(key: String, value: String, fileName: String): Unit = js.native
    def append(key: String, value: Buffer): Unit = js.native
    def append(key: String, value: Buffer, fileName: String): Unit = js.native
    def append(key: String, value: Blob): Unit = js.native
    def append(key: String, value: Blob, fileName: String): Unit = js.native
  }
  
  @scala.inline
  def getFormDataEntries(fd: FormData): js.Array[FormDataEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormDataEntries")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormDataEntry]]
  
  trait FormDataEntry extends StObject {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var value: String | Blob | Buffer
  }
  object FormDataEntry {
    
    @scala.inline
    def apply(key: String, value: String | Blob | Buffer): FormDataEntry = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormDataEntry]
    }
    
    @scala.inline
    implicit class FormDataEntryMutableBuilder[Self <: FormDataEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Blob | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
