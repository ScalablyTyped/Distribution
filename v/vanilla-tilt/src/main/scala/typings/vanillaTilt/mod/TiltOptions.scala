package typings.vanillaTilt.mod

import typings.vanillaTilt.vanillaTiltStrings.x
import typings.vanillaTilt.vanillaTiltStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiltOptions extends js.Object {
  
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
  implicit class TiltOptionsOps[Self <: TiltOptions] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: typings.vanillaTilt.vanillaTiltStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setAxisNull: Self = this.set("axis", null)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def `setFull-page-listening`(value: Boolean): Self = this.set("full-page-listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFull-page-listening`: Self = this.set("full-page-listening", js.undefined)
    
    @scala.inline
    def setGlare(value: Boolean): Self = this.set("glare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlare: Self = this.set("glare", js.undefined)
    
    @scala.inline
    def `setGlare-prerender`(value: Boolean): Self = this.set("glare-prerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGlare-prerender`: Self = this.set("glare-prerender", js.undefined)
    
    @scala.inline
    def setGyroscope(value: Boolean): Self = this.set("gyroscope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscope: Self = this.set("gyroscope", js.undefined)
    
    @scala.inline
    def setGyroscopeMaxAngleX(value: Double): Self = this.set("gyroscopeMaxAngleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscopeMaxAngleX: Self = this.set("gyroscopeMaxAngleX", js.undefined)
    
    @scala.inline
    def setGyroscopeMaxAngleY(value: Double): Self = this.set("gyroscopeMaxAngleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscopeMaxAngleY: Self = this.set("gyroscopeMaxAngleY", js.undefined)
    
    @scala.inline
    def setGyroscopeMinAngleX(value: Double): Self = this.set("gyroscopeMinAngleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscopeMinAngleX: Self = this.set("gyroscopeMinAngleX", js.undefined)
    
    @scala.inline
    def setGyroscopeMinAngleY(value: Double): Self = this.set("gyroscopeMinAngleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscopeMinAngleY: Self = this.set("gyroscopeMinAngleY", js.undefined)
    
    @scala.inline
    def setGyroscopeSamples(value: Double): Self = this.set("gyroscopeSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGyroscopeSamples: Self = this.set("gyroscopeSamples", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def `setMax-glare`(value: Double): Self = this.set("max-glare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-glare`: Self = this.set("max-glare", js.undefined)
    
    @scala.inline
    def `setMouse-event-element`(value: String): Self = this.set("mouse-event-element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMouse-event-element`: Self = this.set("mouse-event-element", js.undefined)
    
    @scala.inline
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartY: Self = this.set("startY", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
