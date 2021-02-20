package typings.typescript.mod

import typings.typescript.typescriptNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizedComment extends CommentRange {
  
  @JSName("end")
  var end_SynthesizedComment: `-1` = js.native
  
  var hasLeadingNewline: js.UndefOr[Boolean] = js.native
  
  @JSName("pos")
  var pos_SynthesizedComment: `-1` = js.native
  
  var text: java.lang.String = js.native
}
object SynthesizedComment {
  
  @scala.inline
  def apply(end: `-1`, kind: CommentKind, pos: `-1`, text: java.lang.String): SynthesizedComment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizedComment]
  }
  
  @scala.inline
  implicit class SynthesizedCommentMutableBuilder[Self <: SynthesizedComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: `-1`): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLeadingNewline(value: Boolean): Self = StObject.set(x, "hasLeadingNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLeadingNewlineUndefined: Self = StObject.set(x, "hasLeadingNewline", js.undefined)
    
    @scala.inline
    def setPos(value: `-1`): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
