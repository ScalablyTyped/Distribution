package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.DIRECTIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive
  extends StObject
     with Node {
  
  @JSName("anchor")
  val anchor_Directive: Null
  
  var name: String
  
  val parameters: js.Array[String]
  
  @JSName("tag")
  val tag_Directive: Null
  
  @JSName("type")
  var type_Directive: DIRECTIVE
}
object Directive {
  
  inline def apply(
    anchor: Null,
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    name: String,
    parameters: js.Array[String],
    props: js.Array[Range],
    tag: Null,
    `type`: DIRECTIVE,
    valueRangeContainsNewline: Boolean
  ): Directive = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], comment = null, context = null, error = null, range = null, rawValue = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  extension [Self <: Directive](x: Self) {
    
    inline def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: DIRECTIVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
