package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSettingButton extends CreatedButton {
  
  def offTap(callback: js.Function0[Unit]): Unit = js.native
  
  def onTap(callback: js.Function0[Unit]): Unit = js.native
}
object OpenSettingButton {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    image: String,
    offTap: js.Function0[Unit] => Unit,
    onTap: js.Function0[Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): OpenSettingButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingButton]
  }
  
  @scala.inline
  implicit class OpenSettingButtonMutableBuilder[Self <: OpenSettingButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffTap(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "offTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTap(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
  }
}
