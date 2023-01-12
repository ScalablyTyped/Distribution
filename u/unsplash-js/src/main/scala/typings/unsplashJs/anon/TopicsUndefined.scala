package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicsUndefined extends StObject {
  
  var topics: Unit
}
object TopicsUndefined {
  
  inline def apply(topics: Unit): TopicsUndefined = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicsUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicsUndefined] (val x: Self) extends AnyVal {
    
    inline def setTopics(value: Unit): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
