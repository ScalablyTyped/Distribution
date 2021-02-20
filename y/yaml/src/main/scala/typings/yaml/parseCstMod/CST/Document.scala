package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.DOCUMENT
import org.scalablytyped.runtime.StObject
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
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Null): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: js.Array[BlankLine | Comment | ContentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: (BlankLine | Comment | ContentNode)*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[BlankLine | Comment | Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: (BlankLine | Comment | Directive)*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DOCUMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
