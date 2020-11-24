package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.yandexMapsStrings.hidden
import typings.yandexMaps.yandexMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPane extends IEventEmitter {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getMap(): Map_ = js.native
  
  def getOverflow(): visible | hidden = js.native
  
  def getZIndex(): Double = js.native
}
object IPane {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: IEventManager[js.Object],
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
    __obj.asInstanceOf[IPane]
  }
  
  @scala.inline
  implicit class IPaneOps[Self <: IPane] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMap(value: () => Map_): Self = this.set("getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOverflow(value: () => visible | hidden): Self = this.set("getOverflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZIndex(value: () => Double): Self = this.set("getZIndex", js.Any.fromFunction0(value))
  }
}
