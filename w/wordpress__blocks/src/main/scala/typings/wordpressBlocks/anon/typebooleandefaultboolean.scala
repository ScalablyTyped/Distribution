package typings.wordpressBlocks.anon

import typings.wordpressBlocks.mod.AttributeSource.Attribute
import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'boolean',   default :boolean | undefined} & {  source :'attribute',   attribute :string,   selector :string | undefined} */
trait typebooleandefaultboolean
  extends StObject
     with Attribute {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var attribute: String
  
  var selector: js.UndefOr[String] = js.undefined
  
  var source: attribute
  
  var `type`: boolean
}
object typebooleandefaultboolean {
  
  inline def apply(attribute: String): typebooleandefaultboolean = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typebooleandefaultboolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typebooleandefaultboolean] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
