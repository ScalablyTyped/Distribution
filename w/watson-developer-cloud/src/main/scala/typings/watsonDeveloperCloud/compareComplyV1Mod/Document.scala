package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Basic information about the input document. */
trait Document extends StObject {
  
  /** The MD5 hash value of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** The input document converted into HTML format. */
  var html: js.UndefOr[String] = js.undefined
  
  /** The label applied to the input document with the calling method's `file_1_label` or `file_2_label` value. This field is specified only in the output of the **Comparing two documents** method. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Document title, if detected. */
  var title: js.UndefOr[String] = js.undefined
}
object Document {
  
  inline def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
