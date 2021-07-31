package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockEditProps[T /* <: Record[String, js.Any] */]
  extends StObject
     with BlockSaveProps[T] {
  
  val className: String
  
  val clientId: String
  
  val isSelected: Boolean
  
  def setAttributes(attrs: Partial[T]): Unit
}
object BlockEditProps {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](
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
  implicit class BlockEditPropsMutableBuilder[Self <: BlockEditProps[?], T /* <: Record[String, js.Any] */] (val x: Self & BlockEditProps[T]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAttributes(value: Partial[T] => Unit): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
  }
}
