package typings.vivus

import typings.std.HTMLElement
import typings.vivus.vivusStrings.`scenario-sync`
import typings.vivus.vivusStrings.autostart
import typings.vivus.vivusStrings.delayed
import typings.vivus.vivusStrings.end
import typings.vivus.vivusStrings.inViewport
import typings.vivus.vivusStrings.manual
import typings.vivus.vivusStrings.oneByOne
import typings.vivus.vivusStrings.progress
import typings.vivus.vivusStrings.scenario
import typings.vivus.vivusStrings.script
import typings.vivus.vivusStrings.start
import typings.vivus.vivusStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Take any SVG and make the animation
    * to give give the impression of live drawing
    */
  @JSImport("vivus", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Vivus {
    /**
      * @param element Dom element of the SVG or id of it
      * @param options Options about the animation
      * @param callback Callback for the end of the animation
      */
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, options: VivusOptions) = this()
    def this(element: HTMLElement, options: VivusOptions) = this()
    def this(element: String, options: Unit, callback: js.Function1[/* vivusInstance */ Vivus, Unit]) = this()
    def this(element: String, options: VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, Unit]) = this()
    def this(element: HTMLElement, options: Unit, callback: js.Function1[/* vivusInstance */ Vivus, Unit]) = this()
    def this(
      element: HTMLElement,
      options: VivusOptions,
      callback: js.Function1[/* vivusInstance */ Vivus, Unit]
    ) = this()
  }
  @JSImport("vivus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vivus", "EASE")
  @js.native
  def EASE: TimingFunction = js.native
  inline def EASE_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vivus", "EASE_IN")
  @js.native
  def EASE_IN: TimingFunction = js.native
  inline def EASE_IN_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_IN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vivus", "EASE_OUT")
  @js.native
  def EASE_OUT: TimingFunction = js.native
  inline def EASE_OUT_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_OUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vivus", "EASE_OUT_BOUNCE")
  @js.native
  def EASE_OUT_BOUNCE: TimingFunction = js.native
  inline def EASE_OUT_BOUNCE_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EASE_OUT_BOUNCE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vivus", "LINEAR")
  @js.native
  def LINEAR: TimingFunction = js.native
  inline def LINEAR_=(x: TimingFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  type TimingFunction = js.Function1[/* input */ Double, Double]
  
  /**
    * Take any SVG and make the animation
    * to give give the impression of live drawing
    */
  @js.native
  trait Vivus extends StObject {
    
    /**
      * Reset the SVG but make the instance out of order.
      */
    def destroy(): Unit = js.native
    
    /**
      * for types of HTMLElement
      */
    var el: HTMLElement = js.native
    
    /**
      * Completely draws the SVG at its final state.
      */
    def finish(): this.type = js.native
    
    /**
      * Get the status of the animation between start, progress, end.
      */
    def getStatus(): start | progress | end = js.native
    
    /**
      * Plays the animation with the speed given in parameter.
      * A speed of `1` is the normal speed.
      * This value can be negative to go reverse, between 0 and 1 to play slowly, or greater than 1 to go faster.
      * Callback executed after the animation is finished (optional).
      *
      * @param [speed=1] Animation speed
      * @param [callback]
      */
    def play(): this.type = js.native
    /**
      * @param callback
      */
    def play(callback: js.Function0[Unit]): this.type = js.native
    def play(speed: Double): this.type = js.native
    def play(speed: Double, callback: js.Function0[Unit]): this.type = js.native
    def play(speed: Unit, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Reinitialises the SVG to the original undrawn state.
      */
    def reset(): this.type = js.native
    
    /**
      * Set the progress of the animation.
      * Progress must be a `number` between `0` and `1`.
      */
    def setFrameProgress(progress: Double): this.type = js.native
    
    /**
      * Stops the animation.
      */
    def stop(): this.type = js.native
  }
  
  trait VivusOptions extends StObject {
    
    /**
      * Timing animation function for the complete SVG.
      * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
      *
      * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
      */
    var animTimingFunction: js.UndefOr[TimingFunction] = js.undefined
    
    /**
      * Whitespace extra margin between dashes.
      * Increase it in case of glitches at the initial state of the animation.
      *
      * (default: `2`)
      */
    var dashGap: js.UndefOr[Double] = js.undefined
    
    /**
      *     Time between the drawing of first and last path, in frames (only for `delayed` animations).
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation duration, in frames.
      * (default: `200`)
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Link to the SVG to animate.
      * If set, Vivus will create an object tag and append it to the DOM element given to the constructor.
      * Be careful, use the `onReady` callback before playing with the Vivus instance.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Force the browser to re-render all updated path items.
      * By default, the value is `true` on IE only.
      *
      * See [the troubleshooting documentation for more details](https://github.com/maxwellito/vivus#troubleshoot).
      */
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function called when the instance is ready to play.
      */
    var onReady: js.UndefOr[js.Function1[/* vivusInstance */ Vivus, Unit]] = js.undefined
    
    /**
      * Timing animation function for each path element of the SVG.
      * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
      *
      * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
      */
    var pathTimingFunction: js.UndefOr[TimingFunction] = js.undefined
    
    /**
      * Reverse the order of execution.
      * The default behaviour is to render from the first 'path' in the SVG to the last one.
      * This option allow you to reverse the order.
      *
      * (default: `false`)
      */
    var reverseStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Removes all extra styling on the SVG, and leaves it as original.
      */
    var selfDestroy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically starts the animation.
      * Can be `'inViewport'`, `'manual'`, or `'autostart'`
      * (default: `'inViewport'`)
      */
    var start: js.UndefOr[inViewport | manual | autostart] = js.undefined
    
    /**
      * Determines if the item must be drawn asynchronously or not.
      * Can be `'delayed'`, `'sync'`, `'oneByOne'`, `'script'`, `'scenario'`, or `'scenario-sync'`.
      * (default: `'delayed'`)
      */
    var `type`: js.UndefOr[delayed | sync | oneByOne | script | scenario | `scenario-sync`] = js.undefined
  }
  object VivusOptions {
    
    inline def apply(): VivusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VivusOptions]
    }
    
    extension [Self <: VivusOptions](x: Self) {
      
      inline def setAnimTimingFunction(value: /* input */ Double => Double): Self = StObject.set(x, "animTimingFunction", js.Any.fromFunction1(value))
      
      inline def setAnimTimingFunctionUndefined: Self = StObject.set(x, "animTimingFunction", js.undefined)
      
      inline def setDashGap(value: Double): Self = StObject.set(x, "dashGap", value.asInstanceOf[js.Any])
      
      inline def setDashGapUndefined: Self = StObject.set(x, "dashGap", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setOnReady(value: /* vivusInstance */ Vivus => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setPathTimingFunction(value: /* input */ Double => Double): Self = StObject.set(x, "pathTimingFunction", js.Any.fromFunction1(value))
      
      inline def setPathTimingFunctionUndefined: Self = StObject.set(x, "pathTimingFunction", js.undefined)
      
      inline def setReverseStack(value: Boolean): Self = StObject.set(x, "reverseStack", value.asInstanceOf[js.Any])
      
      inline def setReverseStackUndefined: Self = StObject.set(x, "reverseStack", js.undefined)
      
      inline def setSelfDestroy(value: Boolean): Self = StObject.set(x, "selfDestroy", value.asInstanceOf[js.Any])
      
      inline def setSelfDestroyUndefined: Self = StObject.set(x, "selfDestroy", js.undefined)
      
      inline def setStart(value: inViewport | manual | autostart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setType(value: delayed | sync | oneByOne | script | scenario | `scenario-sync`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
