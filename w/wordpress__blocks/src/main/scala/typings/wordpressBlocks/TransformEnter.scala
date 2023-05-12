package typings.wordpressBlocks

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformEnter[T /* <: Record[String, Any] */]
  extends StObject
     with Transform[T] {
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var regExp: js.RegExp
  
  def transform(): BlockInstance[Partial[T]]
  
  var `type`: enter
}
object TransformEnter {
  
  inline def apply[T /* <: Record[String, Any] */](regExp: js.RegExp, transform: () => BlockInstance[Partial[T]]): TransformEnter[T] = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any], transform = js.Any.fromFunction0(transform))
    __obj.updateDynamic("type")("enter")
    __obj.asInstanceOf[TransformEnter[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformEnter[?], T /* <: Record[String, Any] */] (val x: Self & TransformEnter[T]) extends AnyVal {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: () => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction0(value))
    
    inline def setType(value: enter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
