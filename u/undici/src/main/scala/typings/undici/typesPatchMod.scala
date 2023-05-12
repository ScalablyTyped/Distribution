package typings.undici

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPatchMod {
  
  trait AddEventListenerOptions
    extends StObject
       with EventListenerOptions {
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object AddEventListenerOptions {
    
    inline def apply(): AddEventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddEventListenerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddEventListenerOptions] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    / * globalThis * / any extends {  DOMException :infer T} ? T : any
    }}}
    */
  @js.native
  trait DOMException extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    / * globalThis * / any extends {  Event :infer T} ? T : { readonly bubbles :boolean, cancelBubble (): void,  readonly cancelable :boolean,  readonly composed :boolean, composedPath (): [undici.undici/types/patch.EventTarget | undefined],  readonly currentTarget :undici.undici/types/patch.EventTarget | null,  readonly defaultPrevented :boolean,  readonly eventPhase :0 | 2,  readonly isTrusted :boolean, preventDefault (): void,   returnValue :boolean,  readonly srcElement :undici.undici/types/patch.EventTarget | null, stopImmediatePropagation (): void, stopPropagation (): void,  readonly target :undici.undici/types/patch.EventTarget | null,  readonly timeStamp :number,  readonly type :string}
    }}}
    */
  @js.native
  trait Event extends StObject
  
  trait EventInit extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
  }
  object EventInit {
    
    inline def apply(): EventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventInit] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
    }
  }
  
  type EventListener = js.Function1[/* evt */ Event, Unit]
  
  trait EventListenerObject extends StObject {
    
    def handleEvent(`object`: Event): Unit
  }
  object EventListenerObject {
    
    inline def apply(handleEvent: Event => Unit): EventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventListenerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerObject] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait EventListenerOptions extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
  }
  object EventListenerOptions {
    
    inline def apply(): EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListenerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerOptions] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    }
  }
  
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    / * globalThis * / any extends {  EventTarget :infer T} ? T : {addEventListener (type : string, listener : any): void, addEventListener (type : string, listener : any, options : any): void, dispatchEvent (event : undici.undici/types/patch.Event): boolean, removeEventListener (type : string, listener : any): void, removeEventListener (type : string, listener : any, options : any): void, removeEventListener (type : string, listener : any, options : boolean): void}
    }}}
    */
  @js.native
  trait EventTarget extends StObject
}
