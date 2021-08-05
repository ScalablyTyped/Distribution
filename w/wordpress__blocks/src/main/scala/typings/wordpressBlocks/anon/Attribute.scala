package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: String
  
  var selector: js.UndefOr[String] = js.undefined
  
  var source: attribute
}
object Attribute {
  
  inline def apply(attribute: String): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
