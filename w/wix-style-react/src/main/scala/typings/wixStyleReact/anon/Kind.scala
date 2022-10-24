package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var kind: Any
  
  var rtl: Any
  
  var story: Any
  
  var withExamples: Any
}
object Kind {
  
  inline def apply(kind: Any, rtl: Any, story: Any, withExamples: Any): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], withExamples = withExamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: Any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Any): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setStory(value: Any): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    
    inline def setWithExamples(value: Any): Self = StObject.set(x, "withExamples", value.asInstanceOf[js.Any])
  }
}
