package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.shortcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformShortcode[T /* <: Record[String, js.Any] */]
  extends StObject
     with Transform[T] {
  
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var tag: String
  
  var `type`: shortcode
}
object TransformShortcode {
  
  inline def apply[T /* <: Record[String, js.Any] */](tag: String): TransformShortcode[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("shortcode")
    __obj.asInstanceOf[TransformShortcode[T]]
  }
  
  extension [Self <: TransformShortcode[?], T /* <: Record[String, js.Any] */](x: Self & TransformShortcode[T]) {
    
    inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: shortcode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
