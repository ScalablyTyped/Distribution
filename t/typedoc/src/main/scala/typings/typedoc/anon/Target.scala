package typings.typedoc.anon

import typings.typedoc.schemaMod.CommentDisplayPart
import typings.typedoc.typedocStrings.`@$LeftcurlybracketstringRightcurlybracket`
import typings.typedoc.typedocStrings.`inline-tag`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target
  extends StObject
     with CommentDisplayPart {
  
  var kind: `inline-tag`
  
  var tag: `@$LeftcurlybracketstringRightcurlybracket`
  
  var target: js.UndefOr[String | Double] = js.undefined
  
  var text: String
}
object Target {
  
  inline def apply(text: String): Target = {
    val __obj = js.Dynamic.literal(kind = "inline-tag", tag = "@${string}", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setKind(value: `inline-tag`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTag(value: `@$LeftcurlybracketstringRightcurlybracket`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
