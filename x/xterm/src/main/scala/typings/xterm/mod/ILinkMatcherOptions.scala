package typings.xterm.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinkMatcherOptions extends StObject {
  
  /**
    * A callback that fires when the mouse leaves a link. Note that this can
    * happen even when tooltipCallback hasn't fired for the link yet.
    */
  var leaveCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The index of the link from the regex.match(text) call. This defaults to 0
    * (for regular expressions without capture groups).
    */
  var matchIndex: js.UndefOr[Double] = js.native
  
  /**
    * The priority of the link matcher, this defines the order in which the
    * link matcher is evaluated relative to others, from highest to lowest. The
    * default value is 0.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * A callback that fires when the mouse hovers over a link for a period of
    * time (defined by {@link ITerminalOptions.linkTooltipHoverDuration}).
    */
  var tooltipCallback: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* uri */ String, 
      /* location */ IViewportRange, 
      Boolean | Unit
    ]
  ] = js.native
  
  /**
    * A callback that validates whether to create an individual link, pass
    * whether the link is valid to the callback.
    */
  var validationCallback: js.UndefOr[
    js.Function2[/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit], Unit]
  ] = js.native
  
  /**
    * A callback that fires when the mousedown and click events occur that
    * determines whether a link will be activated upon click. This enables
    * only activating a link when a certain modifier is held down, if not the
    * mouse event will continue propagation (eg. double click to select word).
    */
  var willLinkActivate: js.UndefOr[js.Function2[/* event */ MouseEvent, /* uri */ String, Boolean]] = js.native
}
object ILinkMatcherOptions {
  
  @scala.inline
  def apply(): ILinkMatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinkMatcherOptions]
  }
  
  @scala.inline
  implicit class ILinkMatcherOptionsMutableBuilder[Self <: ILinkMatcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaveCallback(value: () => Unit): Self = StObject.set(x, "leaveCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeaveCallbackUndefined: Self = StObject.set(x, "leaveCallback", js.undefined)
    
    @scala.inline
    def setMatchIndex(value: Double): Self = StObject.set(x, "matchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchIndexUndefined: Self = StObject.set(x, "matchIndex", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTooltipCallback(value: (/* event */ MouseEvent, /* uri */ String, /* location */ IViewportRange) => Boolean | Unit): Self = StObject.set(x, "tooltipCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTooltipCallbackUndefined: Self = StObject.set(x, "tooltipCallback", js.undefined)
    
    @scala.inline
    def setValidationCallback(value: (/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit]) => Unit): Self = StObject.set(x, "validationCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidationCallbackUndefined: Self = StObject.set(x, "validationCallback", js.undefined)
    
    @scala.inline
    def setWillLinkActivate(value: (/* event */ MouseEvent, /* uri */ String) => Boolean): Self = StObject.set(x, "willLinkActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWillLinkActivateUndefined: Self = StObject.set(x, "willLinkActivate", js.undefined)
  }
}
