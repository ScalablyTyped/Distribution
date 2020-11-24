package typings.twineSugarcube.jqueryMod.global.JQuery

import typings.std.HTMLElement
import typings.twineSugarcube.passageMod.Passage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  
  /**
    * The element which holds (or will be holding in case of the ':passageinit' event) the redered passage.
    */
  var content: HTMLElement = js.native
}
object PassageRenderingEvent {
  
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    content: HTMLElement,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    passage: Passage,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String
  ): PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), passage = passage.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  
  @scala.inline
  implicit class PassageRenderingEventOps[Self <: PassageRenderingEvent[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
    
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
    def setContent(value: HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
