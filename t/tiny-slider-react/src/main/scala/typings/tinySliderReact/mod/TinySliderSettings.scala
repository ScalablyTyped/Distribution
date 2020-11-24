package typings.tinySliderReact.mod

import typings.std.HTMLElement
import typings.tinySliderReact.tinySliderReactBooleans.`false`
import typings.tinySliderReact.tinySliderReactStrings.backward
import typings.tinySliderReact.tinySliderReactStrings.carousel
import typings.tinySliderReact.tinySliderReactStrings.forward
import typings.tinySliderReact.tinySliderReactStrings.gallery
import typings.tinySliderReact.tinySliderReactStrings.horizontal
import typings.tinySliderReact.tinySliderReactStrings.inner
import typings.tinySliderReact.tinySliderReactStrings.outer
import typings.tinySliderReact.tinySliderReactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinySliderSettings extends CommonOptions {
  
  /**
    * Time between each gallery animation (in "ms").
    * @defaultValue false
    */
  var animateDelay: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Name of intro animation class.
    * @defaultValue "tns-fadeIn"
    */
  var animateIn: js.UndefOr[String] = js.native
  
  /**
    * Name of default animation class.
    * @defaultValue "tns-normal"
    */
  var animateNormal: js.UndefOr[String] = js.native
  
  /**
    * Name of outro animation class.
    * @defaultValue "tns-fadeOut"
    */
  var animateOut: js.UndefOr[String] = js.native
  
  /**
    * The customized autoplay start/stop button or selector.
    * @defaultValue false
    */
  var autoplayButton: js.UndefOr[HTMLElement | String | `false`] = js.native
  
  /**
    * Output autoplayButton markup when autoplay is true but a customized autoplayButton is not provided.
    * @defaultValue true
    */
  var autoplayButtonOutput: js.UndefOr[Boolean] = js.native
  
  /**
    * Direction of slide movement (ascending/descending the slide index).
    * @defaultValue "forward"
    */
  var autoplayDirection: js.UndefOr[forward | backward] = js.native
  
  /**
    * The axis of the slider.
    * @defaultValue "horizontal"
    */
  var axis: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * The container element/selector around the prev/next buttons.
    * controlsContainer must have at least 2 child elements.
    * @defaultValue false
    */
  var controlsContainer: js.UndefOr[HTMLElement | String | `false`] = js.native
  
  /**
    * Indicate whether the slider will be frozen (controls, nav, autoplay and other functions will stop work) when all slides can be displayed in one page.
    * @defaultValue true
    */
  var freezable: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables lazyloading images that are currently not viewed, thus saving bandwidth
    * @defaultValue false
    */
  var lazyload: js.UndefOr[Boolean] = js.native
  
  /**
    * Moves throughout all the slides seamlessly.
    * @defaultValue true
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls animation behaviour.
    * With carousel everything slides to the side, while gallery uses fade animations and changes all slides at once.
    * @defaultValue "carousel"
    */
  var mode: js.UndefOr[carousel | gallery] = js.native
  
  /**
    * Indecate if the dots are thurbnails. If true, they will always be visible even when more than 1 slides displayed in the viewport.
    * @defaultValue false
    */
  var navAsThumbnails: js.UndefOr[Boolean] = js.native
  
  /**
    * The container element/selector around the dots.
    * navContainer must have at least same number of children as the slides.
    * @defaultValue false
    */
  var navContainer: js.UndefOr[HTMLElement | String | `false`] = js.native
  
  /**
    * Difine the relationship between nested sliders.
    * Make sure you run the inner slider first, otherwise the height of the inner slider container will be wrong.
    * @defaultValue false
    */
  var nested: js.UndefOr[inner | outer | `false`] = js.native
  
  /**
    * Callback to be run on initialization.
    * @defaultValue false
    */
  var onInit: js.UndefOr[js.Function0[Unit | `false`]] = js.native
  
  /**
    * Breakpoint: Integer.
    * Defines options for different viewport widths
    * @defaultValue false
    */
  var responsive: js.UndefOr[ResponsiveOptions | `false`] = js.native
  
  /**
    * Moves to the opposite edge when reaching the first or last slide.
    * @defaultValue false
    */
  var rewind: js.UndefOr[Boolean] = js.native
  
  /**
    * Swipe or drag will not be triggered if the angle is not inside the range when set.
    * @defaultValue 15
    */
  var swipeAngle: js.UndefOr[Double | Boolean] = js.native
}
object TinySliderSettings {
  
  @scala.inline
  def apply(): TinySliderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TinySliderSettings]
  }
  
  @scala.inline
  implicit class TinySliderSettingsOps[Self <: TinySliderSettings] (val x: Self) extends AnyVal {
    
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
    def setAnimateDelay(value: Double | `false`): Self = this.set("animateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateDelay: Self = this.set("animateDelay", js.undefined)
    
    @scala.inline
    def setAnimateIn(value: String): Self = this.set("animateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateIn: Self = this.set("animateIn", js.undefined)
    
    @scala.inline
    def setAnimateNormal(value: String): Self = this.set("animateNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateNormal: Self = this.set("animateNormal", js.undefined)
    
    @scala.inline
    def setAnimateOut(value: String): Self = this.set("animateOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOut: Self = this.set("animateOut", js.undefined)
    
    @scala.inline
    def setAutoplayButton(value: HTMLElement | String | `false`): Self = this.set("autoplayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayButton: Self = this.set("autoplayButton", js.undefined)
    
    @scala.inline
    def setAutoplayButtonOutput(value: Boolean): Self = this.set("autoplayButtonOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayButtonOutput: Self = this.set("autoplayButtonOutput", js.undefined)
    
    @scala.inline
    def setAutoplayDirection(value: forward | backward): Self = this.set("autoplayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayDirection: Self = this.set("autoplayDirection", js.undefined)
    
    @scala.inline
    def setAxis(value: horizontal | vertical): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setControlsContainer(value: HTMLElement | String | `false`): Self = this.set("controlsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsContainer: Self = this.set("controlsContainer", js.undefined)
    
    @scala.inline
    def setFreezable(value: Boolean): Self = this.set("freezable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreezable: Self = this.set("freezable", js.undefined)
    
    @scala.inline
    def setLazyload(value: Boolean): Self = this.set("lazyload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyload: Self = this.set("lazyload", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMode(value: carousel | gallery): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNavAsThumbnails(value: Boolean): Self = this.set("navAsThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavAsThumbnails: Self = this.set("navAsThumbnails", js.undefined)
    
    @scala.inline
    def setNavContainer(value: HTMLElement | String | `false`): Self = this.set("navContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavContainer: Self = this.set("navContainer", js.undefined)
    
    @scala.inline
    def setNested(value: inner | outer | `false`): Self = this.set("nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNested: Self = this.set("nested", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit | `false`): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setResponsive(value: ResponsiveOptions | `false`): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    
    @scala.inline
    def setSwipeAngle(value: Double | Boolean): Self = this.set("swipeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeAngle: Self = this.set("swipeAngle", js.undefined)
  }
}
