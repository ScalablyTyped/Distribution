package typings.twineSugarcube.jqueryMod.global.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] extends js.Object {
  
  @JSName(":passagedisplay")
  var Colonpassagedisplay: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  
  @JSName(":passageend")
  var Colonpassageend: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  
  @JSName(":passageinit")
  var Colonpassageinit: PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  
  @JSName(":passagerender")
  var Colonpassagerender: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
  
  @JSName(":passagestart")
  var Colonpassagestart: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = js.native
}
object TypeToTriggeredEventMap {
  
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    Colonpassagedisplay: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    Colonpassageend: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    Colonpassageinit: PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    Colonpassagerender: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
    Colonpassagestart: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  ): TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(":passagedisplay")(Colonpassagedisplay.asInstanceOf[js.Any])
    __obj.updateDynamic(":passageend")(Colonpassageend.asInstanceOf[js.Any])
    __obj.updateDynamic(":passageinit")(Colonpassageinit.asInstanceOf[js.Any])
    __obj.updateDynamic(":passagerender")(Colonpassagerender.asInstanceOf[js.Any])
    __obj.updateDynamic(":passagestart")(Colonpassagestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  
  @scala.inline
  implicit class TypeToTriggeredEventMapOps[Self <: TypeToTriggeredEventMap[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
    
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
    def setColonpassagedisplay(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set(":passagedisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonpassageend(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set(":passageend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonpassageinit(value: PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set(":passageinit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonpassagerender(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set(":passagerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonpassagestart(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = this.set(":passagestart", value.asInstanceOf[js.Any])
  }
}
