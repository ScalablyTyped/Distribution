package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockEditProps[T /* <: Record[String, _] */] extends BlockSaveProps[T] {
  
  val className: String = js.native
  
  val clientId: String = js.native
  
  val isSelected: Boolean = js.native
  
  def setAttributes(attrs: Partial[T]): Unit = js.native
}
object BlockEditProps {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
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
  implicit class BlockEditPropsMutableBuilder[Self <: BlockEditProps[_], T /* <: Record[String, _] */] (val x: Self with BlockEditProps[T]) extends AnyVal {
    
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
