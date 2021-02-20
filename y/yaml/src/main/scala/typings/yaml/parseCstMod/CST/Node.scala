package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type
import typings.yaml.utilMod.YAMLSyntaxError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  val anchor: String | Null = js.native
  
  val comment: String | Null = js.native
  
  var context: ParseContext | Null = js.native
  
  /** if not null, indicates a parser failure */
  var error: YAMLSyntaxError | Null = js.native
  
  val hasComment: Boolean = js.native
  
  val hasProps: Boolean = js.native
  
  val jsonLike: Boolean = js.native
  
  /** anchors, tags and comments */
  var props: js.Array[Range] = js.native
  
  /** span of context.src parsed into this node */
  var range: Range | Null = js.native
  
  val rawValue: String | Null = js.native
  
  val tag: Null | Verbatim | Handle = js.native
  
  /** specific node type */
  var `type`: Type = js.native
  
  /** if non-null, overrides source value */
  var value: String | Null = js.native
  
  var valueRange: Range | Null = js.native
  
  val valueRangeContainsNewline: Boolean = js.native
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
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
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
