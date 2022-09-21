package typings.yaireoTagify.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tag has been added but did not pass validation.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait InvalidTagEventData[T /* <: BaseTagData */]
  extends StObject
     with TagEventData[T] {
  
  @JSName("data")
  var data_InvalidTagEventData: T
  
  /**
    * Message indicating the type of error. Can be either a boolean to indicate success,
    * or a message code as defined with {@link InvalidTagsMessages} or returned by the custom {@link TagifySettings.validate} method.
    */
  var message: String | Boolean
}
object InvalidTagEventData {
  
  inline def apply[T /* <: BaseTagData */](data: T, message: String | Boolean, tag: HTMLElement, tagify: Tagify[T]): InvalidTagEventData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTagEventData[T]]
  }
  
  extension [Self <: InvalidTagEventData[?], T /* <: BaseTagData */](x: Self & InvalidTagEventData[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String | Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
