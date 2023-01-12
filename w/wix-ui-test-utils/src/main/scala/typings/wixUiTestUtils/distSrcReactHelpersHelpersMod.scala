package typings.wixUiTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChangeEvent
import typings.react.mod.FunctionComponent
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.wixUiTestUtils.anon.Instantiable
import typings.wixUiTestUtils.anon.TypeofSimulate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReactHelpersHelpersMod {
  
  @JSImport("wix-ui-test-utils/dist/src/react-helpers/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def reactEventTrigger(): TypeofSimulate = ^.asInstanceOf[js.Dynamic].applyDynamic("reactEventTrigger")().asInstanceOf[TypeofSimulate]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait ControlledChangeEvent[T]
    extends StObject
       with ChangeEvent[T] {
    
    @JSName("target")
    var target_ControlledChangeEvent: ControlledEventTarget & T
  }
  object ControlledChangeEvent {
    
    inline def apply[T](
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget & T,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: ControlledEventTarget & T,
      timeStamp: Double,
      `type`: String
    ): ControlledChangeEvent[T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledChangeEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledChangeEvent[?], T] (val x: Self & ControlledChangeEvent[T]) extends AnyVal {
      
      inline def setTarget(value: ControlledEventTarget & T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlledComponentProps
    extends StObject
       with /* otherProps */ StringDictionary[Any] {
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLElement], Unit]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ControlledComponentProps {
    
    inline def apply(): ControlledComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlledComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledComponentProps] (val x: Self) extends AnyVal {
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ControlledComponentState extends StObject {
    
    var value: String
  }
  object ControlledComponentState {
    
    inline def apply(value: String): ControlledComponentState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledComponentState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledComponentState] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ControlledEventTarget
    extends StObject
       with EventTarget {
    
    var value: String = js.native
  }
}
