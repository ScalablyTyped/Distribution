package typings.typescript.mod

import typings.typescript.typescriptNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizedComment
  extends StObject
     with CommentRange {
  
  @JSName("end")
  var end_SynthesizedComment: `-1`
  
  var hasLeadingNewline: js.UndefOr[Boolean] = js.undefined
  
  @JSName("pos")
  var pos_SynthesizedComment: `-1`
  
  var text: java.lang.String
}
object SynthesizedComment {
  
  inline def apply(kind: CommentKind, text: java.lang.String): SynthesizedComment = {
    val __obj = js.Dynamic.literal(end = -1, kind = kind.asInstanceOf[js.Any], pos = -1, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizedComment]
  }
  
  extension [Self <: SynthesizedComment](x: Self) {
    
    inline def setEnd(value: `-1`): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setHasLeadingNewline(value: Boolean): Self = StObject.set(x, "hasLeadingNewline", value.asInstanceOf[js.Any])
    
    inline def setHasLeadingNewlineUndefined: Self = StObject.set(x, "hasLeadingNewline", js.undefined)
    
    inline def setPos(value: `-1`): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
