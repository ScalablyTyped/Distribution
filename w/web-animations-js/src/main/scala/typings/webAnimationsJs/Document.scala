package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  val timeline: AnimationTimeline
}
object Document {
  
  inline def apply(timeline: AnimationTimeline): Document = {
    val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setTimeline(value: AnimationTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
