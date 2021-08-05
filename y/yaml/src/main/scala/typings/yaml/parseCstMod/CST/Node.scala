package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type
import typings.yaml.utilMod.YAMLSyntaxError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  val anchor: String | Null
  
  val comment: String | Null
  
  var context: ParseContext | Null
  
  /** if not null, indicates a parser failure */
  var error: YAMLSyntaxError | Null
  
  val hasComment: Boolean
  
  val hasProps: Boolean
  
  val jsonLike: Boolean
  
  /** anchors, tags and comments */
  var props: js.Array[Range]
  
  /** span of context.src parsed into this node */
  var range: Range | Null
  
  val rawValue: String | Null
  
  val tag: Null | Verbatim | Handle
  
  /** specific node type */
  var `type`: Type
  
  /** if non-null, overrides source value */
  var value: String | Null
  
  var valueRange: Range | Null
  
  val valueRangeContainsNewline: Boolean
}
object Node {
  
  inline def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: Type,
    valueRangeContainsNewline: Boolean
  ): Node = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, rawValue = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setContext(value: ParseContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setError(value: YAMLSyntaxError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setHasComment(value: Boolean): Self = StObject.set(x, "hasComment", value.asInstanceOf[js.Any])
    
    inline def setHasProps(value: Boolean): Self = StObject.set(x, "hasProps", value.asInstanceOf[js.Any])
    
    inline def setJsonLike(value: Boolean): Self = StObject.set(x, "jsonLike", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Array[Range]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: Range*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    inline def setTag(value: Verbatim | Handle): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeContainsNewline(value: Boolean): Self = StObject.set(x, "valueRangeContainsNewline", value.asInstanceOf[js.Any])
    
    inline def setValueRangeNull: Self = StObject.set(x, "valueRange", null)
  }
}
