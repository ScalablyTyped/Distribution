package typings.yaml.anon

import typings.yaml.yamlStrings.Leftcurlybracket
import typings.yaml.yamlStrings.Rightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndStart extends StObject {
  
  var end: Rightcurlybracket
  
  var start: Leftcurlybracket
}
object EndStart {
  
  inline def apply(): EndStart = {
    val __obj = js.Dynamic.literal(end = "}", start = "{")
    __obj.asInstanceOf[EndStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndStart] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Rightcurlybracket): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Leftcurlybracket): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
