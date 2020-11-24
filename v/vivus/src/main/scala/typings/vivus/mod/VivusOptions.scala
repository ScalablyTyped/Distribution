package typings.vivus.mod

import typings.vivus.vivusStrings.`scenario-sync`
import typings.vivus.vivusStrings.autostart
import typings.vivus.vivusStrings.delayed
import typings.vivus.vivusStrings.inViewport
import typings.vivus.vivusStrings.manual
import typings.vivus.vivusStrings.oneByOne
import typings.vivus.vivusStrings.scenario
import typings.vivus.vivusStrings.script
import typings.vivus.vivusStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VivusOptions extends js.Object {
  
  /**
    * Timing animation function for the complete SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var animTimingFunction: js.UndefOr[TimingFunction] = js.native
  
  /**
    * Whitespace extra margin between dashes.
    * Increase it in case of glitches at the initial state of the animation.
    *
    * (default: `2`)
    */
  var dashGap: js.UndefOr[Double] = js.native
  
  /**
    *     Time between the drawing of first and last path, in frames (only for `delayed` animations).
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Animation duration, in frames.
    * (default: `200`)
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Link to the SVG to animate.
    * If set, Vivus will create an object tag and append it to the DOM element given to the constructor.
    * Be careful, use the `onReady` callback before playing with the Vivus instance.
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * Force the browser to re-render all updated path items.
    * By default, the value is `true` on IE only.
    *
    * See [the troubleshooting documentation for more details](https://github.com/maxwellito/vivus#troubleshoot).
    */
  var forceRender: js.UndefOr[Boolean] = js.native
  
  /**
    * Function called when the instance is ready to play.
    */
  var onReady: js.UndefOr[js.Function1[/* vivusInstance */ Vivus, Unit]] = js.native
  
  /**
    * Timing animation function for each path element of the SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var pathTimingFunction: js.UndefOr[TimingFunction] = js.native
  
  /**
    * Reverse the order of execution.
    * The default behaviour is to render from the first 'path' in the SVG to the last one.
    * This option allow you to reverse the order.
    *
    * (default: `false`)
    */
  var reverseStack: js.UndefOr[Boolean] = js.native
  
  /**
    * Removes all extra styling on the SVG, and leaves it as original.
    */
  var selfDestroy: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically starts the animation.
    * Can be `'inViewport'`, `'manual'`, or `'autostart'`
    * (default: `'inViewport'`)
    */
  var start: js.UndefOr[inViewport | manual | autostart] = js.native
  
  /**
    * Determines if the item must be drawn asynchronously or not.
    * Can be `'delayed'`, `'sync'`, `'oneByOne'`, `'script'`, `'scenario'`, or `'scenario-sync'`.
    * (default: `'delayed'`)
    */
  var `type`: js.UndefOr[delayed | sync | oneByOne | script | scenario | `scenario-sync`] = js.native
}
object VivusOptions {
  
  @scala.inline
  def apply(): VivusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VivusOptions]
  }
  
  @scala.inline
  implicit class VivusOptionsOps[Self <: VivusOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimTimingFunction(value: /* input */ Double => Double): Self = this.set("animTimingFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnimTimingFunction: Self = this.set("animTimingFunction", js.undefined)
    
    @scala.inline
    def setDashGap(value: Double): Self = this.set("dashGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashGap: Self = this.set("dashGap", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* vivusInstance */ Vivus => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setPathTimingFunction(value: /* input */ Double => Double): Self = this.set("pathTimingFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePathTimingFunction: Self = this.set("pathTimingFunction", js.undefined)
    
    @scala.inline
    def setReverseStack(value: Boolean): Self = this.set("reverseStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseStack: Self = this.set("reverseStack", js.undefined)
    
    @scala.inline
    def setSelfDestroy(value: Boolean): Self = this.set("selfDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfDestroy: Self = this.set("selfDestroy", js.undefined)
    
    @scala.inline
    def setStart(value: inViewport | manual | autostart): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setType(value: delayed | sync | oneByOne | script | scenario | `scenario-sync`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
