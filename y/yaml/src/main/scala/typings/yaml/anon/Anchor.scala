package typings.yaml.anon

import typings.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var anchor: SourceToken | Null
  
  var comma: SourceToken | Null
  
  var comment: String
  
  var end: Double
  
  var found: SourceToken | Null
  
  var hasNewline: Boolean
  
  var hasNewlineAfterProp: Boolean
  
  var spaceBefore: Boolean
  
  var start: Double
  
  var tag: SourceToken | Null
}
object Anchor {
  
  inline def apply(
    comment: String,
    end: Double,
    hasNewline: Boolean,
    hasNewlineAfterProp: Boolean,
    spaceBefore: Boolean,
    start: Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], hasNewline = hasNewline.asInstanceOf[js.Any], hasNewlineAfterProp = hasNewlineAfterProp.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], anchor = null, comma = null, found = null, tag = null)
    __obj.asInstanceOf[Anchor]
  }
  
  extension [Self <: Anchor](x: Self) {
    
    inline def setAnchor(value: SourceToken): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setComma(value: SourceToken): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
    
    inline def setCommaNull: Self = StObject.set(x, "comma", null)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFound(value: SourceToken): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundNull: Self = StObject.set(x, "found", null)
    
    inline def setHasNewline(value: Boolean): Self = StObject.set(x, "hasNewline", value.asInstanceOf[js.Any])
    
    inline def setHasNewlineAfterProp(value: Boolean): Self = StObject.set(x, "hasNewlineAfterProp", value.asInstanceOf[js.Any])
    
    inline def setSpaceBefore(value: Boolean): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTag(value: SourceToken): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
  }
}
