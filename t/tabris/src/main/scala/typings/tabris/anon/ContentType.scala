package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var jobName: js.UndefOr[String] = js.undefined
}
object ContentType {
  
  @scala.inline
  def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
  }
}
