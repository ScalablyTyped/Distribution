package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the parsed input document. */
trait DocInfo extends StObject {
  
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** The full text of the parsed document in HTML format. */
  var html: js.UndefOr[String] = js.undefined
  
  /** The title of the parsed document. If the service did not detect a title, the value of this element is `null`. */
  var title: js.UndefOr[String] = js.undefined
}
object DocInfo {
  
  inline def apply(): DocInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocInfo]
  }
  
  extension [Self <: DocInfo](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
