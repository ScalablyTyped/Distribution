package typings.tinySliderReact.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinySliderProps extends js.Object {
  
  var onClick: js.UndefOr[
    js.Function3[/* slideClicked */ Double, /* info */ String, /* event */ Event, Unit]
  ] = js.native
  
  var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  
  var settings: js.UndefOr[TinySliderSettings] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
}
object TinySliderProps {
  
  @scala.inline
  def apply(): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TinySliderProps]
  }
  
  @scala.inline
  implicit class TinySliderPropsOps[Self <: TinySliderProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Unit): Self = this.set("onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnIndexChanged(value: /* info */ TinySliderInfo => Unit): Self = this.set("onIndexChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIndexChanged: Self = this.set("onIndexChanged", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* info */ TinySliderInfo => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* info */ TinySliderInfo => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* info */ TinySliderInfo => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: /* info */ TinySliderInfo => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionStart(value: /* info */ TinySliderInfo => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    
    @scala.inline
    def setSettings(value: TinySliderSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
