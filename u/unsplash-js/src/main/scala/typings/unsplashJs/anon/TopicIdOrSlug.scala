package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicIdOrSlug extends StObject {
  
  var topicIdOrSlug: String
}
object TopicIdOrSlug {
  
  inline def apply(topicIdOrSlug: String): TopicIdOrSlug = {
    val __obj = js.Dynamic.literal(topicIdOrSlug = topicIdOrSlug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicIdOrSlug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicIdOrSlug] (val x: Self) extends AnyVal {
    
    inline def setTopicIdOrSlug(value: String): Self = StObject.set(x, "topicIdOrSlug", value.asInstanceOf[js.Any])
  }
}
