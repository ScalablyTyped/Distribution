package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topics extends StObject {
  
  var topics: String
}
object Topics {
  
  inline def apply(topics: String): Topics = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Topics] (val x: Self) extends AnyVal {
    
    inline def setTopics(value: String): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
