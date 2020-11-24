package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type
import typings.yaml.utilMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
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
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasComment(value: Boolean): Self = this.set("hasComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasProps(value: Boolean): Self = this.set("hasProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonLike(value: Boolean): Self = this.set("jsonLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsVarargs(value: Range*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[Range]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeContainsNewline(value: Boolean): Self = this.set("valueRangeContainsNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorNull: Self = this.set("anchor", null)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    
    @scala.inline
    def setContext(value: ParseContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setError(value: YAMLSyntaxError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = this.set("range", null)
    
    @scala.inline
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueNull: Self = this.set("rawValue", null)
    
    @scala.inline
    def setTag(value: Verbatim | Handle): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNull: Self = this.set("tag", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeNull: Self = this.set("valueRange", null)
  }
}
