package typings.vanillaTilt

import typings.std.HTMLElement
import typings.vanillaTilt.vanillaTiltStrings.x
import typings.vanillaTilt.vanillaTiltStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-tilt", JSImport.Default)
  @js.native
  class default protected () extends VanillaTilt {
    /**
      * Creates a new instance of a VanillaTilt element.
      * @param element The element, which should be a VanillaTilt element
      * @param settings Settings which configures the element
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, settings: TiltOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("vanilla-tilt", "default.init")
    @js.native
    def init(elements: js.Array[HTMLElement]): Unit = js.native
    @JSImport("vanilla-tilt", "default.init")
    @js.native
    def init(elements: js.Array[HTMLElement], settings: TiltOptions): Unit = js.native
    /**
      * Initializes one or multiple elements
      * @param elements The element, which should tilt
      * @param settings Settings, which configures the elements
      */
    @JSImport("vanilla-tilt", "default.init")
    @js.native
    def init(elements: HTMLElement): Unit = js.native
    @JSImport("vanilla-tilt", "default.init")
    @js.native
    def init(elements: HTMLElement, settings: TiltOptions): Unit = js.native
  }
  
  @js.native
  trait HTMLVanillaTiltElement extends HTMLElement {
    
    var vanillaTilt: VanillaTilt = js.native
  }
  
  @js.native
  trait TiltOptions extends StObject {
    
    /**
      * What axis should be disabled. Can be X or Y.
      */
    var axis: js.UndefOr[Null | x | y] = js.native
    
    /**
      * Easing on enter/exit.
      */
    var easing: js.UndefOr[String] = js.native
    
    // If true, parallax effect will listen to mouse move events on the whole document, not only the selected element
    var `full-page-listening`: js.UndefOr[Boolean] = js.native
    
    /**
      * if it should have a "glare" effect
      */
    var glare: js.UndefOr[Boolean] = js.native
    
    /**
      * false = VanillaTilt creates the glare elements for you, otherwise
      * you need to add .js-tilt-glare>.js-tilt-glare-inner by yourself
      */
    var `glare-prerender`: js.UndefOr[Boolean] = js.native
    
    // Boolean to enable/disable device orientation detection,
    var gyroscope: js.UndefOr[Boolean] = js.native
    
    // This is the top limit of the device angle on X axis,
    // meaning that a device rotated at this angle would tilt the element as if
    // the mouse was on the right border of the element;
    var gyroscopeMaxAngleX: js.UndefOr[Double] = js.native
    
    // This is the top limit of the device angle on Y axis,
    // meaning that a device rotated at this angle would tilt the element as if
    // the mouse was on the bottom border of the element;
    var gyroscopeMaxAngleY: js.UndefOr[Double] = js.native
    
    // This is the bottom limit of the device angle on X axis,
    // meaning that a device rotated at this angle would tilt the element as if
    // the mouse was on the left border of the element;
    var gyroscopeMinAngleX: js.UndefOr[Double] = js.native
    
    // This is the bottom limit of the device angle on Y axis,
    // meaning that a device rotated at this angle would tilt the element as if
    // the mouse was on the top border of the element;
    var gyroscopeMinAngleY: js.UndefOr[Double] = js.native
    
    //How many gyroscope moves to decide the starting position.
    var gyroscopeSamples: js.UndefOr[Double] = js.native
    
    /**
      * Max tilt rotation (degrees)
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * the maximum "glare" opacity
      */
    var `max-glare`: js.UndefOr[Double] = js.native
    
    // css-selector or link to HTML-element what will be listen mouse events
    var `mouse-event-element`: js.UndefOr[String] = js.native
    
    /**
      * Transform perspective, the lower the more extreme the tilt gets.
      */
    var perspective: js.UndefOr[Double] = js.native
    
    /**
      * If the tilt effect has to be reset on exit.
      */
    var reset: js.UndefOr[Boolean] = js.native
    
    /**
      * Reverse the tilt direction
      */
    var reverse: js.UndefOr[Boolean] = js.native
    
    /**
      * 2 = 200%, 1.5 = 150%, etc..
      */
    var scale: js.UndefOr[Double] = js.native
    
    /**
      * Speed of the enter/exit transition
      */
    var speed: js.UndefOr[Double] = js.native
    
    /**
      * Starting X tilt rotation (degrees)
      */
    var startX: js.UndefOr[Double] = js.native
    
    /**
      * Starting Y tilt rotation (degrees)
      */
    var startY: js.UndefOr[Double] = js.native
    
    /**
      * Set a transition on enter/exit.
      */
    var transition: js.UndefOr[Boolean] = js.native
  }
  object TiltOptions {
    
    @scala.inline
    def apply(): TiltOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TiltOptions]
    }
    
    @scala.inline
    implicit class TiltOptionsMutableBuilder[Self <: TiltOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typings.vanillaTilt.vanillaTiltStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisNull: Self = StObject.set(x, "axis", null)
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def `setFull-page-listening`(value: Boolean): Self = StObject.set(x, "full-page-listening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFull-page-listeningUndefined`: Self = StObject.set(x, "full-page-listening", js.undefined)
      
      @scala.inline
      def setGlare(value: Boolean): Self = StObject.set(x, "glare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlare-prerender`(value: Boolean): Self = StObject.set(x, "glare-prerender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlare-prerenderUndefined`: Self = StObject.set(x, "glare-prerender", js.undefined)
      
      @scala.inline
      def setGlareUndefined: Self = StObject.set(x, "glare", js.undefined)
      
      @scala.inline
      def setGyroscope(value: Boolean): Self = StObject.set(x, "gyroscope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeMaxAngleX(value: Double): Self = StObject.set(x, "gyroscopeMaxAngleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeMaxAngleXUndefined: Self = StObject.set(x, "gyroscopeMaxAngleX", js.undefined)
      
      @scala.inline
      def setGyroscopeMaxAngleY(value: Double): Self = StObject.set(x, "gyroscopeMaxAngleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeMaxAngleYUndefined: Self = StObject.set(x, "gyroscopeMaxAngleY", js.undefined)
      
      @scala.inline
      def setGyroscopeMinAngleX(value: Double): Self = StObject.set(x, "gyroscopeMinAngleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeMinAngleXUndefined: Self = StObject.set(x, "gyroscopeMinAngleX", js.undefined)
      
      @scala.inline
      def setGyroscopeMinAngleY(value: Double): Self = StObject.set(x, "gyroscopeMinAngleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeMinAngleYUndefined: Self = StObject.set(x, "gyroscopeMinAngleY", js.undefined)
      
      @scala.inline
      def setGyroscopeSamples(value: Double): Self = StObject.set(x, "gyroscopeSamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGyroscopeSamplesUndefined: Self = StObject.set(x, "gyroscopeSamples", js.undefined)
      
      @scala.inline
      def setGyroscopeUndefined: Self = StObject.set(x, "gyroscope", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-glare`(value: Double): Self = StObject.set(x, "max-glare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-glareUndefined`: Self = StObject.set(x, "max-glare", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def `setMouse-event-element`(value: String): Self = StObject.set(x, "mouse-event-element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMouse-event-elementUndefined`: Self = StObject.set(x, "mouse-event-element", js.undefined)
      
      @scala.inline
      def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      @scala.inline
      def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      @scala.inline
      def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  @js.native
  trait TiltValues extends StObject {
    
    /**
      * The current percentage on the X axis
      */
    var percentageX: Double = js.native
    
    /**
      * The current percentage on the Y axis
      */
    var percentageY: Double = js.native
    
    /**
      * The current tilt on the X axis
      */
    var tiltX: Double = js.native
    
    /**
      * The current tilt on the Y axis
      */
    var tiltY: Double = js.native
  }
  object TiltValues {
    
    @scala.inline
    def apply(percentageX: Double, percentageY: Double, tiltX: Double, tiltY: Double): TiltValues = {
      val __obj = js.Dynamic.literal(percentageX = percentageX.asInstanceOf[js.Any], percentageY = percentageY.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any])
      __obj.asInstanceOf[TiltValues]
    }
    
    @scala.inline
    implicit class TiltValuesMutableBuilder[Self <: TiltValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercentageX(value: Double): Self = StObject.set(x, "percentageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageY(value: Double): Self = StObject.set(x, "percentageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VanillaTilt extends StObject {
    
    /**
      * Start listening to events
      */
    def addEventListeners(): Unit = js.native
    
    /**
      * Destroys the instance and removes the listeners.
      */
    def destroy(): Unit = js.native
    
    /**
      * Get values of instance
      */
    def getValues(): TiltValues = js.native
    
    /**
      * Stop listening to events
      */
    def removeEventListener(): Unit = js.native
    
    /**
      * Resets the styling
      */
    def reset(): Unit = js.native
  }
  object VanillaTilt {
    
    @scala.inline
    def apply(
      addEventListeners: () => Unit,
      destroy: () => Unit,
      getValues: () => TiltValues,
      removeEventListener: () => Unit,
      reset: () => Unit
    ): VanillaTilt = {
      val __obj = js.Dynamic.literal(addEventListeners = js.Any.fromFunction0(addEventListeners), destroy = js.Any.fromFunction0(destroy), getValues = js.Any.fromFunction0(getValues), removeEventListener = js.Any.fromFunction0(removeEventListener), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[VanillaTilt]
    }
    
    @scala.inline
    implicit class VanillaTiltMutableBuilder[Self <: VanillaTilt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListeners(value: () => Unit): Self = StObject.set(x, "addEventListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValues(value: () => TiltValues): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveEventListener(value: () => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
