package typings.tooltipster.JQueryTooltipster

import org.scalablytyped.runtime.StringDictionary
import typings.tooltipster.Anon_Click
import typings.tooltipster.Anon_ClickMouseenter
import typings.tooltipster.JQuery
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
import scala.scalajs.js.annotation._

trait ITooltipsterOptions
  extends /**
		 * Several plugins may have options of the same name. To resolve the conflict, wrap the options of plugins 
		 * under a property with their full name.
		 */
/* pluginName */ StringDictionary[js.Any] {
  /**
  		 * The minimum version of Internet Explorer to run on. 
  		 * @default 6
  		 */
  var IEmin: js.UndefOr[Double] = js.undefined
  /**
  		 * Determines how the tooltip will animate in and out. In addition to the built-in transitions, 
  		 * you may also create custom transitions in your CSS files. In IE9 and lower, all animations 
  		 * default to a JavaScript generated, fade animation. 
  		 * @default 'fade'
  		 */
  var animation: js.UndefOr[fade | grow | swing | slide | fall] = js.undefined
  /**
  		 * Sets the duration of the animation, in milliseconds. If you wish to provide different durations 
  		 * for the opening and closing animations, provide an array of two different values. 
  		 * @default 350
  		 */
  var animationDuration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  		 * Add a "speech bubble" arrow to the tooltip. 
  		 * @default true
  		 */
  var arrow: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If set, this will override the content of the tooltip. If you provide something else than a string 
  		 * or jQuery-wrapped HTML element, you will need to use the 'functionFormat' option to format your 
  		 * content for display. 
  		 * @default null
  		 */
  var content: js.UndefOr[String | JQuery | js.Any] = js.undefined
  /**
  		 * If the content of the tooltip is provided as a string, it is displayed as plain text by default. 
  		 * If this content should actually be interpreted as HTML, set this option to true. 
  		 * @default false
  		 */
  var contentAsHTML: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If you provide a jQuery object to the 'content' option, this sets if it is a clone of this object 
  		 * that should actually be used. 
  		 * @default false
  		 */
  var contentCloning: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Tooltipster logs hints and notices into the console when you're doing something you ideally shouldn't 
  		 * be doing. Set to false to disable logging. 
  		 * @default true
  		 */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Upon mouse interaction, this is the delay before the tooltip starts its opening and closing animations 
  		 * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
  		 * you may provide an array of two different values. 
  		 * @default 300
  		 */
  var delay: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  		 * Upon touch interaction, this is the delay before the tooltip starts its opening and closing animations 
  		 * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
  		 * you may provide an array of two different values. 
  		 * @default [300, 500]
  		 */
  var delayTouch: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  		 * The distance between the origin and the tooltip, in pixels. The value may be an integer or an array of 
  		 * integers (in the usual CSS syntax) if you wish to specify a different distance for each side. 
  		 * @default 6
  		 */
  var distance: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  		 * A custom function to be fired once the tooltip has been closed and removed from the DOM. 
  		 * @default null
  		 */
  var functionAfter: js.UndefOr[TooltipsterStandardCallbackFunction] = js.undefined
  /**
  		 * A custom function to be fired before the tooltip is opened. This function may prevent the opening if it 
  		 * returns false. 
  		 * @default null
  		 */
  var functionBefore: js.UndefOr[TooltipsterStandardCallbackFunction] = js.undefined
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
  ] = js.undefined
  /**
  		 * A custom function to be fired only once at instantiation. 
  		 * @default null
  		 */
  var functionInit: js.UndefOr[TooltipsterStandardCallbackFunction] = js.undefined
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
  ] = js.undefined
  /**
  		 * A custom function to be fired when the tooltip and its contents have been added to the DOM. 
  		 * @default null
  		 */
  var functionReady: js.UndefOr[TooltipsterStandardCallbackFunction] = js.undefined
  /**
  		 * Give users the possibility to interact with the content of the tooltip. If you want them to be able to 
  		 * make clicks, fill forms or do other interactions inside the tooltip, you have to set this option to 
  		 * true. When the 'hover' close trigger is used, the user has to move the cursor to the tooltip before it 
  		 * starts closing (this lapse of time has its duration set by the 'delay' option). 
  		 * @default false
  		 */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Set a maximum width for the tooltip. 
  		 * @default null (no max width)
  		 */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
  		 * Corresponds to the minimum distance to enforce between the center of the arrow and the edges of the 
  		 * tooltip. Mainly used to create an arrow bigger than those of the default themes. 
  		 * @default 16
  		 */
  var minIntersection: js.UndefOr[Double] = js.undefined
  /**
  		 * Set a minimum width for the tooltip. 
  		 * @default 0 (auto width)
  		 */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
  		 * Allows you to put several tooltips on a single element (see the multiple section). 
  		 * @default false
  		 */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The names of plugins to be used by Tooltipster. 
  		 * @default ['sideTip']
  		 */
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * Repositions the tooltip if it goes out of the viewport when the user scrolls the page, in order to 
  		 * keep it visible as long as possible. 
  		 * @default false
  		 */
  var repositionOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Specifies if a TITLE attribute should be restored on the HTML element after a call to the 'destroy' 
  		 * method. This attribute may be omitted, or be restored with the value that existed before Tooltipster 
  		 * was initialized, or be restored with the stringified value of the current content. Note: in case of 
  		 * multiple tooltips on a single element, only the last destroyed tooltip may trigger a restoration. 
  		 * 
  		 * @default 'none'
  		 */
  var restoration: js.UndefOr[none | previous | current] = js.undefined
  /**
  		 * Sets if the tooltip should self-destruct after a few seconds when its origin is removed from the DOM. 
  		 * This prevents memory leaks. 
  		 * @default true
  		 */
  var selfDestruction: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Sets the side of the tooltip. The value may one of the following: 'top', 'bottom', 'left', 'right'. 
  		 * It may also be an array containing one or more of these values. When using an array, the order of 
  		 * values is taken into account as order of fallbacks and the absence of a side disables it (see the 
  		 * sides section). Default: ['top', 'bottom', 'right', 'left']
  		 */
  var side: js.UndefOr[TooltipPositioningSide | js.Array[TooltipPositioningSide]] = js.undefined
  /**
  		 * Set a theme that will override the default tooltip appearance. You may provide an array of strings 
  		 * to apply several themes at once (see the themes section). 
  		 * @default: []
  		 */
  var theme: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  		 * How long (in ms) the tooltip should live before closing. 
  		 * @default 0 (disabled)
  		 */
  var timer: js.UndefOr[Double] = js.undefined
  var trackOrigin: js.UndefOr[Boolean] = js.undefined
  var trackTooltip: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Sets how often the tracker should run (see trackOrigin and trackTooltip), in milliseconds. The tracker 
  		 * runs even if trackOrigin and trackTooltip are false to check if the origin has not been removed while 
  		 * the tooltip was open, so you shouldn't set too high or too low values unless you need to. 
  		 * @default 500
  		 */
  var trackerInterval: js.UndefOr[Double] = js.undefined
  /**
  		 * Set how tooltips should be activated and closed.
  		 * Possible values: hover, click or custom.
  		 */
  var trigger: js.UndefOr[String] = js.undefined
  /**
  		 * When 'trigger' is set to 'custom', all built-in close triggers are disabled by default. This option 
  		 * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
  		 * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
  		 */
  var triggerClose: js.UndefOr[Anon_Click] = js.undefined
  /**
  		 * When 'trigger' is set to 'custom', all built-in open triggers are disabled by default. This option 
  		 * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
  		 * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
  		 */
  var triggerOpen: js.UndefOr[Anon_ClickMouseenter] = js.undefined
  /**
  		 * Plays a subtle animation when the content of the tooltip is updated (if the tooltip is open). You 
  		 * may create custom animations in your CSS files. Set to null to disable the animation. 
  		 * @default 'rotate'
  		 */
  var updateAnimation: js.UndefOr[fade | rotate | scale | Null] = js.undefined
  /**
  		 * Tries to place the tooltip in such a way that it will be entirely visible on screen when it's opened.
  		 * If the tooltip is to be opened while its origin is off screen (using a method call), you may want to 
  		 * set this option to false. 
  		 * @default true
  		 */
  var viewportAware: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Set the z-index of the tooltip. 
  		 * @default 9999999
  		 */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ITooltipsterOptions {
  @scala.inline
  def apply(
    IEmin: Int | Double = null,
    StringDictionary: /**
  		 * Several plugins may have options of the same name. To resolve the conflict, wrap the options of plugins 
  		 * under a property with their full name.
  		 */
  /* pluginName */ StringDictionary[js.Any] = null,
    animation: fade | grow | swing | slide | fall = null,
    animationDuration: Double | js.Array[Double] = null,
    arrow: js.UndefOr[Boolean] = js.undefined,
    content: String | JQuery | js.Any = null,
    contentAsHTML: js.UndefOr[Boolean] = js.undefined,
    contentCloning: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    delay: Double | js.Array[Double] = null,
    delayTouch: Double | js.Array[Double] = null,
    distance: Double | js.Array[Double] = null,
    functionAfter: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit = null,
    functionBefore: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit = null,
    functionFormat: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* content */ js.Any) => String | JQuery = null,
    functionInit: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit = null,
    functionPosition: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* position */ ITooltipPosition) => ITooltipPosition = null,
    functionReady: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    minIntersection: Int | Double = null,
    minWidth: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[String] = null,
    repositionOnScroll: js.UndefOr[Boolean] = js.undefined,
    restoration: none | previous | current = null,
    selfDestruction: js.UndefOr[Boolean] = js.undefined,
    side: TooltipPositioningSide | js.Array[TooltipPositioningSide] = null,
    theme: String | js.Array[String] = null,
    timer: Int | Double = null,
    trackOrigin: js.UndefOr[Boolean] = js.undefined,
    trackTooltip: js.UndefOr[Boolean] = js.undefined,
    trackerInterval: Int | Double = null,
    trigger: String = null,
    triggerClose: Anon_Click = null,
    triggerOpen: Anon_ClickMouseenter = null,
    updateAnimation: fade | rotate | scale = null,
    viewportAware: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): ITooltipsterOptions = {
    val __obj = js.Dynamic.literal()
    if (IEmin != null) __obj.updateDynamic("IEmin")(IEmin.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(arrow)) __obj.updateDynamic("arrow")(arrow)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(contentAsHTML)) __obj.updateDynamic("contentAsHTML")(contentAsHTML)
    if (!js.isUndefined(contentCloning)) __obj.updateDynamic("contentCloning")(contentCloning)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (delayTouch != null) __obj.updateDynamic("delayTouch")(delayTouch.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (functionAfter != null) __obj.updateDynamic("functionAfter")(js.Any.fromFunction2(functionAfter))
    if (functionBefore != null) __obj.updateDynamic("functionBefore")(js.Any.fromFunction2(functionBefore))
    if (functionFormat != null) __obj.updateDynamic("functionFormat")(js.Any.fromFunction3(functionFormat))
    if (functionInit != null) __obj.updateDynamic("functionInit")(js.Any.fromFunction2(functionInit))
    if (functionPosition != null) __obj.updateDynamic("functionPosition")(js.Any.fromFunction3(functionPosition))
    if (functionReady != null) __obj.updateDynamic("functionReady")(js.Any.fromFunction2(functionReady))
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minIntersection != null) __obj.updateDynamic("minIntersection")(minIntersection.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (restoration != null) __obj.updateDynamic("restoration")(restoration.asInstanceOf[js.Any])
    if (!js.isUndefined(selfDestruction)) __obj.updateDynamic("selfDestruction")(selfDestruction)
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (!js.isUndefined(trackOrigin)) __obj.updateDynamic("trackOrigin")(trackOrigin)
    if (!js.isUndefined(trackTooltip)) __obj.updateDynamic("trackTooltip")(trackTooltip)
    if (trackerInterval != null) __obj.updateDynamic("trackerInterval")(trackerInterval.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (triggerClose != null) __obj.updateDynamic("triggerClose")(triggerClose)
    if (triggerOpen != null) __obj.updateDynamic("triggerOpen")(triggerOpen)
    if (updateAnimation != null) __obj.updateDynamic("updateAnimation")(updateAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportAware)) __obj.updateDynamic("viewportAware")(viewportAware)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterOptions]
  }
}

