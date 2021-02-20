package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.shortcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformShortcode[T /* <: Record[String, _] */] extends Transform[T] {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var tag: String = js.native
  
  var `type`: shortcode = js.native
}
object TransformShortcode {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](tag: String, `type`: shortcode): TransformShortcode[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformShortcode[T]]
  }
  
  @scala.inline
  implicit class TransformShortcodeMutableBuilder[Self <: TransformShortcode[_], T /* <: Record[String, _] */] (val x: Self with TransformShortcode[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: shortcode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
