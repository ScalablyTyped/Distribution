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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentNull: Self = StObject.set(x, "comment", null)
    
    @scala.inline
    def setContext(value: ParseContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setError(value: YAMLSyntaxError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setHasComment(value: Boolean): Self = StObject.set(x, "hasComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasProps(value: Boolean): Self = StObject.set(x, "hasProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonLike(value: Boolean): Self = StObject.set(x, "jsonLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Array[Range]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsVarargs(value: Range*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = StObject.set(x, "range", null)
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    @scala.inline
    def setTag(value: Verbatim | Handle): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNull: Self = StObject.set(x, "tag", null)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeContainsNewline(value: Boolean): Self = StObject.set(x, "valueRangeContainsNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeNull: Self = StObject.set(x, "valueRange", null)
  }
}
