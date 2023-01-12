package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockEditProps[T /* <: Record[String, Any] */]
  extends StObject
     with BlockSaveProps[T] {
  
  val clientId: String
  
  val isSelected: Boolean
  
  def setAttributes(attrs: Partial[T]): Unit
}
object BlockEditProps {
  
  inline def apply[T /* <: Record[String, Any] */](
    attributes: T,
    className: String,
    clientId: String,
    isSelected: Boolean,
    setAttributes: Partial[T] => Unit
  ): BlockEditProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[BlockEditProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockEditProps[?], T /* <: Record[String, Any] */] (val x: Self & BlockEditProps[T]) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setSetAttributes(value: Partial[T] => Unit): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
  }
}
