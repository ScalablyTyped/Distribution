package typings.wordpressBlocks

import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.shortcode
import typings.wordpressShortcode.mod.ShortcodeMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformShortcode[T /* <: Record[String, Any] */]
  extends StObject
     with Transform[T] {
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var tag: String
  
  var transform: js.UndefOr[js.Function2[/* attributes */ Any, /* match */ ShortcodeMatch, BlockInstance[T]]] = js.undefined
  
  var `type`: shortcode
}
object TransformShortcode {
  
  inline def apply[T /* <: Record[String, Any] */](tag: String): TransformShortcode[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("shortcode")
    __obj.asInstanceOf[TransformShortcode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformShortcode[?], T /* <: Record[String, Any] */] (val x: Self & TransformShortcode[T]) extends AnyVal {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: (/* attributes */ Any, /* match */ ShortcodeMatch) => BlockInstance[T]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setType(value: shortcode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
