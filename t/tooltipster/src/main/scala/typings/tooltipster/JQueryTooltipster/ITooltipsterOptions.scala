package typings.tooltipster.JQueryTooltipster

import org.scalablytyped.runtime.StringDictionary
import typings.tooltipster.JQuery
import typings.tooltipster.anon.Click
import typings.tooltipster.anon.Mouseenter
import typings.tooltipster.tooltipsterStrings.current
import typings.tooltipster.tooltipsterStrings.fade
import typings.tooltipster.tooltipsterStrings.fall
import typings.tooltipster.tooltipsterStrings.grow
import typings.tooltipster.tooltipsterStrings.none
import typings.tooltipster.tooltipsterStrings.previous
import typings.tooltipster.tooltipsterStrings.rotate
import typings.tooltipster.tooltipsterStrings.scale
import typings.tooltipster.tooltipsterStrings.slide
import typings.tooltipster.tooltipsterStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipsterOptions
  extends /**
  * Several plugins may have methods of the same name. To resolve the conflict, use the instance object of the 
  * tooltip and specify the full name of the desired plugin in your calls.
  */
/* pluginName */ StringDictionary[js.Any] {
  
  /**
    * The minimum version of Internet Explorer to run on. 
    * @default 6
    */
  var IEmin: js.UndefOr[Double] = js.native
  
  /**
    * Determines how the tooltip will animate in and out. In addition to the built-in transitions, 
    * you may also create custom transitions in your CSS files. In IE9 and lower, all animations 
    * default to a JavaScript generated, fade animation. 
    * @default 'fade'
    */
  var animation: js.UndefOr[fade | grow | swing | slide | fall] = js.native
  
  /**
    * Sets the duration of the animation, in milliseconds. If you wish to provide different durations 
    * for the opening and closing animations, provide an array of two different values. 
    * @default 350
    */
  var animationDuration: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Add a "speech bubble" arrow to the tooltip. 
    * @default true
    */
  var arrow: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, this will override the content of the tooltip. If you provide something else than a string 
    * or jQuery-wrapped HTML element, you will need to use the 'functionFormat' option to format your 
    * content for display. 
    * @default null
    */
  var content: js.UndefOr[String | JQuery | js.Any] = js.native
  
  /**
    * If the content of the tooltip is provided as a string, it is displayed as plain text by default. 
    * If this content should actually be interpreted as HTML, set this option to true. 
    * @default false
    */
  var contentAsHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * If you provide a jQuery object to the 'content' option, this sets if it is a clone of this object 
    * that should actually be used. 
    * @default false
    */
  var contentCloning: js.UndefOr[Boolean] = js.native
  
  /**
    * Tooltipster logs hints and notices into the console when you're doing something you ideally shouldn't 
    * be doing. Set to false to disable logging. 
    * @default true
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Upon mouse interaction, this is the delay before the tooltip starts its opening and closing animations 
    * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
    * you may provide an array of two different values. 
    * @default 300
    */
  var delay: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Upon touch interaction, this is the delay before the tooltip starts its opening and closing animations 
    * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
    * you may provide an array of two different values. 
    * @default [300, 500]
    */
  var delayTouch: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * The distance between the origin and the tooltip, in pixels. The value may be an integer or an array of 
    * integers (in the usual CSS syntax) if you wish to specify a different distance for each side. 
    * @default 6
    */
  var distance: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * A custom function to be fired once the tooltip has been closed and removed from the DOM. 
    * @default null
    */
  var functionAfter: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  
  /**
    * A custom function to be fired before the tooltip is opened. This function may prevent the opening if it 
    * returns false. 
    * @default null
    */
  var functionBefore: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  
  /**
    * A custom function that does not modify the content but that can format it for display. It gets the two 
    * first usual arguments and also the content as third argument. It must return the value that will be 
    * displayed in the tooltip, either a string or a jQuery-wrapped HTML element (see the formatting section). 
    * @default null
    */
  var functionFormat: js.UndefOr[
    js.Function3[
      /* instance */ ITooltipsterInstance, 
      /* helper */ ITooltipsterHelper, 
      /* content */ js.Any, 
      String | JQuery
    ]
  ] = js.native
  
  /**
    * A custom function to be fired only once at instantiation. 
    * @default null
    */
  var functionInit: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  
  /**
    * A custom function fired when the tooltip is repositioned. It gives you the ability to slightly or 
    * completely modify the position that Tooltipster is about to give to the tooltip. It gets the proposed 
    * set of placement values as third argument. The function must return the set of placement values, which 
    * you may have edited (see the positioning section). 
    * @default null
    */
  var functionPosition: js.UndefOr[
    js.Function3[
      /* instance */ ITooltipsterInstance, 
      /* helper */ ITooltipsterHelper, 
      /* position */ ITooltipPosition, 
      ITooltipPosition
    ]
  ] = js.native
  
  /**
    * A custom function to be fired when the tooltip and its contents have been added to the DOM. 
    * @default null
    */
  var functionReady: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
  
  /**
    * Give users the possibility to interact with the content of the tooltip. If you want them to be able to 
    * make clicks, fill forms or do other interactions inside the tooltip, you have to set this option to 
    * true. When the 'hover' close trigger is used, the user has to move the cursor to the tooltip before it 
    * starts closing (this lapse of time has its duration set by the 'delay' option). 
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Set a maximum width for the tooltip. 
    * @default null (no max width)
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Corresponds to the minimum distance to enforce between the center of the arrow and the edges of the 
    * tooltip. Mainly used to create an arrow bigger than those of the default themes. 
    * @default 16
    */
  var minIntersection: js.UndefOr[Double] = js.native
  
  /**
    * Set a minimum width for the tooltip. 
    * @default 0 (auto width)
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Allows you to put several tooltips on a single element (see the multiple section). 
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * The names of plugins to be used by Tooltipster. 
    * @default ['sideTip']
    */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Repositions the tooltip if it goes out of the viewport when the user scrolls the page, in order to 
    * keep it visible as long as possible. 
    * @default false
    */
  var repositionOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if a TITLE attribute should be restored on the HTML element after a call to the 'destroy' 
    * method. This attribute may be omitted, or be restored with the value that existed before Tooltipster 
    * was initialized, or be restored with the stringified value of the current content. Note: in case of 
    * multiple tooltips on a single element, only the last destroyed tooltip may trigger a restoration. 
    * 
    * @default 'none'
    */
  var restoration: js.UndefOr[none | previous | current] = js.native
  
  /**
    * Sets if the tooltip should self-destruct after a few seconds when its origin is removed from the DOM. 
    * This prevents memory leaks. 
    * @default true
    */
  var selfDestruction: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the side of the tooltip. The value may one of the following: 'top', 'bottom', 'left', 'right'. 
    * It may also be an array containing one or more of these values. When using an array, the order of 
    * values is taken into account as order of fallbacks and the absence of a side disables it (see the 
    * sides section). Default: ['top', 'bottom', 'right', 'left']
    */
  var side: js.UndefOr[TooltipPositioningSide | js.Array[TooltipPositioningSide]] = js.native
  
  /**
    * Set a theme that will override the default tooltip appearance. You may provide an array of strings 
    * to apply several themes at once (see the themes section). 
    * @default: []
    */
  var theme: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * How long (in ms) the tooltip should live before closing. 
    * @default 0 (disabled)
    */
  var timer: js.UndefOr[Double] = js.native
  
  var trackOrigin: js.UndefOr[Boolean] = js.native
  
  var trackTooltip: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets how often the tracker should run (see trackOrigin and trackTooltip), in milliseconds. The tracker 
    * runs even if trackOrigin and trackTooltip are false to check if the origin has not been removed while 
    * the tooltip was open, so you shouldn't set too high or too low values unless you need to. 
    * @default 500
    */
  var trackerInterval: js.UndefOr[Double] = js.native
  
  /**
    * Set how tooltips should be activated and closed.
    * Possible values: hover, click or custom.
    */
  var trigger: js.UndefOr[String] = js.native
  
  /**
    * When 'trigger' is set to 'custom', all built-in close triggers are disabled by default. This option 
    * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
    * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
    */
  var triggerClose: js.UndefOr[Click] = js.native
  
  /**
    * When 'trigger' is set to 'custom', all built-in open triggers are disabled by default. This option 
    * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
    * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
    */
  var triggerOpen: js.UndefOr[Mouseenter] = js.native
  
  /**
    * Plays a subtle animation when the content of the tooltip is updated (if the tooltip is open). You 
    * may create custom animations in your CSS files. Set to null to disable the animation. 
    * @default 'rotate'
    */
  var updateAnimation: js.UndefOr[fade | rotate | scale | Null] = js.native
  
  /**
    * Tries to place the tooltip in such a way that it will be entirely visible on screen when it's opened.
    * If the tooltip is to be opened while its origin is off screen (using a method call), you may want to 
    * set this option to false. 
    * @default true
    */
  var viewportAware: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the z-index of the tooltip. 
    * @default 9999999
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object ITooltipsterOptions {
  
  @scala.inline
  def apply(): ITooltipsterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipsterOptions]
  }
  
  @scala.inline
  implicit class ITooltipsterOptionsOps[Self <: ITooltipsterOptions] (val x: Self) extends AnyVal {
    
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
    def setIEmin(value: Double): Self = this.set("IEmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIEmin: Self = this.set("IEmin", js.undefined)
    
    @scala.inline
    def setAnimation(value: fade | grow | swing | slide | fall): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationDurationVarargs(value: Double*): Self = this.set("animationDuration", js.Array(value :_*))
    
    @scala.inline
    def setAnimationDuration(value: Double | js.Array[Double]): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setContent(value: String | JQuery | js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentAsHTML(value: Boolean): Self = this.set("contentAsHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAsHTML: Self = this.set("contentAsHTML", js.undefined)
    
    @scala.inline
    def setContentCloning(value: Boolean): Self = this.set("contentCloning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCloning: Self = this.set("contentCloning", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelayVarargs(value: Double*): Self = this.set("delay", js.Array(value :_*))
    
    @scala.inline
    def setDelay(value: Double | js.Array[Double]): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDelayTouchVarargs(value: Double*): Self = this.set("delayTouch", js.Array(value :_*))
    
    @scala.inline
    def setDelayTouch(value: Double | js.Array[Double]): Self = this.set("delayTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayTouch: Self = this.set("delayTouch", js.undefined)
    
    @scala.inline
    def setDistanceVarargs(value: Double*): Self = this.set("distance", js.Array(value :_*))
    
    @scala.inline
    def setDistance(value: Double | js.Array[Double]): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setFunctionAfter(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = this.set("functionAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFunctionAfter: Self = this.set("functionAfter", js.undefined)
    
    @scala.inline
    def setFunctionBefore(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = this.set("functionBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFunctionBefore: Self = this.set("functionBefore", js.undefined)
    
    @scala.inline
    def setFunctionFormat(
      value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* content */ js.Any) => String | JQuery
    ): Self = this.set("functionFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionFormat: Self = this.set("functionFormat", js.undefined)
    
    @scala.inline
    def setFunctionInit(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = this.set("functionInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFunctionInit: Self = this.set("functionInit", js.undefined)
    
    @scala.inline
    def setFunctionPosition(
      value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* position */ ITooltipPosition) => ITooltipPosition
    ): Self = this.set("functionPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunctionPosition: Self = this.set("functionPosition", js.undefined)
    
    @scala.inline
    def setFunctionReady(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = this.set("functionReady", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFunctionReady: Self = this.set("functionReady", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinIntersection(value: Double): Self = this.set("minIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinIntersection: Self = this.set("minIntersection", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRepositionOnScroll(value: Boolean): Self = this.set("repositionOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositionOnScroll: Self = this.set("repositionOnScroll", js.undefined)
    
    @scala.inline
    def setRestoration(value: none | previous | current): Self = this.set("restoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoration: Self = this.set("restoration", js.undefined)
    
    @scala.inline
    def setSelfDestruction(value: Boolean): Self = this.set("selfDestruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfDestruction: Self = this.set("selfDestruction", js.undefined)
    
    @scala.inline
    def setSideVarargs(value: TooltipPositioningSide*): Self = this.set("side", js.Array(value :_*))
    
    @scala.inline
    def setSide(value: TooltipPositioningSide | js.Array[TooltipPositioningSide]): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setThemeVarargs(value: String*): Self = this.set("theme", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String | js.Array[String]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    
    @scala.inline
    def setTrackOrigin(value: Boolean): Self = this.set("trackOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackOrigin: Self = this.set("trackOrigin", js.undefined)
    
    @scala.inline
    def setTrackTooltip(value: Boolean): Self = this.set("trackTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackTooltip: Self = this.set("trackTooltip", js.undefined)
    
    @scala.inline
    def setTrackerInterval(value: Double): Self = this.set("trackerInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackerInterval: Self = this.set("trackerInterval", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setTriggerClose(value: Click): Self = this.set("triggerClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerClose: Self = this.set("triggerClose", js.undefined)
    
    @scala.inline
    def setTriggerOpen(value: Mouseenter): Self = this.set("triggerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerOpen: Self = this.set("triggerOpen", js.undefined)
    
    @scala.inline
    def setUpdateAnimation(value: fade | rotate | scale): Self = this.set("updateAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAnimation: Self = this.set("updateAnimation", js.undefined)
    
    @scala.inline
    def setUpdateAnimationNull: Self = this.set("updateAnimation", null)
    
    @scala.inline
    def setViewportAware(value: Boolean): Self = this.set("viewportAware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportAware: Self = this.set("viewportAware", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
