package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
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
  implicit class BlockEditPropsOps[Self <: BlockEditProps[_], T /* <: Record[String, _] */] (val x: Self with BlockEditProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAttributes(value: Partial[T] => Unit): Self = this.set("setAttributes", js.Any.fromFunction1(value))
  }
}
