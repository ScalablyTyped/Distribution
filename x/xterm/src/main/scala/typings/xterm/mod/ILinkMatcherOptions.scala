package typings.xterm.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinkMatcherOptions extends js.Object {
  
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
  implicit class ILinkMatcherOptionsOps[Self <: ILinkMatcherOptions] (val x: Self) extends AnyVal {
    
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
    def setLeaveCallback(value: () => Unit): Self = this.set("leaveCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLeaveCallback: Self = this.set("leaveCallback", js.undefined)
    
    @scala.inline
    def setMatchIndex(value: Double): Self = this.set("matchIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchIndex: Self = this.set("matchIndex", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setTooltipCallback(value: (/* event */ MouseEvent, /* uri */ String, /* location */ IViewportRange) => Boolean | Unit): Self = this.set("tooltipCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTooltipCallback: Self = this.set("tooltipCallback", js.undefined)
    
    @scala.inline
    def setValidationCallback(value: (/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit]) => Unit): Self = this.set("validationCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValidationCallback: Self = this.set("validationCallback", js.undefined)
    
    @scala.inline
    def setWillLinkActivate(value: (/* event */ MouseEvent, /* uri */ String) => Boolean): Self = this.set("willLinkActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWillLinkActivate: Self = this.set("willLinkActivate", js.undefined)
  }
}
