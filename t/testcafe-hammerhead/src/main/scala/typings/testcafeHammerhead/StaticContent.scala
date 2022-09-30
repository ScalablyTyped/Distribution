package typings.testcafeHammerhead

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticContent extends StObject {
  
  var content: String | Buffer
  
  var contentType: String
  
  var etag: js.UndefOr[String] = js.undefined
  
  var isShadowUIStylesheet: js.UndefOr[Boolean] = js.undefined
}
object StaticContent {
  
  inline def apply(content: String | Buffer, contentType: String): StaticContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticContent]
  }
  
  extension [Self <: StaticContent](x: Self) {
    
    inline def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIsShadowUIStylesheet(value: Boolean): Self = StObject.set(x, "isShadowUIStylesheet", value.asInstanceOf[js.Any])
    
    inline def setIsShadowUIStylesheetUndefined: Self = StObject.set(x, "isShadowUIStylesheet", js.undefined)
  }
}
