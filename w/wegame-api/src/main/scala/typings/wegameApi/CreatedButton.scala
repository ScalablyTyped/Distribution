package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatedButton extends StObject {
  
  def destroy(): Unit = js.native
  
  def hide(): Unit = js.native
  
  var image: String = js.native
  
  // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def show(): Unit = js.native
  
  var style: ButtonStyle = js.native
  
  var text: String = js.native
  
  var `type`: ButtonType = js.native
}
object CreatedButton {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    onTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): CreatedButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedButton]
  }
  
  @scala.inline
  implicit class CreatedButtonMutableBuilder[Self <: CreatedButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffTap(value: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "offTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTap(value: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
