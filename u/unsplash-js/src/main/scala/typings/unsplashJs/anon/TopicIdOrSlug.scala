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
  
  extension [Self <: TopicIdOrSlug](x: Self) {
    
    inline def setTopicIdOrSlug(value: String): Self = StObject.set(x, "topicIdOrSlug", value.asInstanceOf[js.Any])
  }
}
