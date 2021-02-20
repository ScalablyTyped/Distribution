package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import typings.wordpressBlocks.wordpressBlocksStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Attribute & {  type :'boolean'} */
@js.native
trait Attributetypeboolean extends StObject {
  
  var attribute: String = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var source: attribute = js.native
  
  var `type`: (js.UndefOr[string | boolean]) with boolean = js.native
}
object Attributetypeboolean {
  
  @scala.inline
  def apply(attribute: String, source: attribute, `type`: (js.UndefOr[string | boolean]) with boolean): Attributetypeboolean = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributetypeboolean]
  }
  
  @scala.inline
  implicit class AttributetypebooleanMutableBuilder[Self <: Attributetypeboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: (js.UndefOr[string | boolean]) with boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
