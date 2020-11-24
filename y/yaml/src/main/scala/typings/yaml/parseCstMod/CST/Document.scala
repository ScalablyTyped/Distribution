package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends Node {
  
  @JSName("anchor")
  val anchor_Document: Null = js.native
  
  @JSName("comment")
  val comment_Document: Null = js.native
  
  var contents: js.Array[BlankLine | Comment | ContentNode] = js.native
  
  var directives: js.Array[BlankLine | Comment | Directive] = js.native
  
  @JSName("tag")
  val tag_Document: Null = js.native
  
  @JSName("type")
  var type_Document: DOCUMENT = js.native
}
object Document {
  
  @scala.inline
  def apply(
    anchor: Null,
    comment: Null,
    contents: js.Array[BlankLine | Comment | ContentNode],
    directives: js.Array[BlankLine | Comment | Directive],
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    tag: Null,
    `type`: DOCUMENT,
    valueRangeContainsNewline: Boolean
  ): Document = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Null): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Null): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: (BlankLine | Comment | ContentNode)*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[BlankLine | Comment | ContentNode]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: (BlankLine | Comment | Directive)*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[BlankLine | Comment | Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Null): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DOCUMENT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
