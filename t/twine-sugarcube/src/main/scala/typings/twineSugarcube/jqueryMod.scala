package typings.twineSugarcube

import typings.jquery.JQuery.TriggeredEvent
import typings.std.HTMLElement
import typings.twineSugarcube.passageMod.Passage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jqueryMod {
  
  object global {
    
    object JQuery {
      
      @js.native
      trait PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
        
        /**
          * The incoming passage object.
          */
        var passage: Passage = js.native
      }
      object PassageNavigationEvent {
        
        @scala.inline
        def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
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
        ): PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
          val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), passage = passage.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
        }
        
        @scala.inline
        implicit class PassageNavigationEventMutableBuilder[Self <: PassageNavigationEvent[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
          
          @scala.inline
          def setPassage(value: Passage): Self = StObject.set(x, "passage", value.asInstanceOf[js.Any])
        }
      }
      
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
        implicit class PassageRenderingEventMutableBuilder[Self <: PassageRenderingEvent[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
          
          @scala.inline
          def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] extends StObject {
        
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
        implicit class TypeToTriggeredEventMapMutableBuilder[Self <: TypeToTriggeredEventMap[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
          
          @scala.inline
          def setColonpassagedisplay(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, ":passagedisplay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColonpassageend(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, ":passageend", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColonpassageinit(value: PassageNavigationEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, ":passageinit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColonpassagerender(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, ":passagerender", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColonpassagestart(value: PassageRenderingEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, ":passagestart", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
