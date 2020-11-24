package typings.tinySliderReact.mod

import typings.tinySliderReact.tinySliderReactBooleans.`false`
import typings.tinySliderReact.tinySliderReactStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  /**
    * Allows using arrow keys to switch slides.
    * @defaultValue false
    */
  var arrowKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Height of slider container changes according to each slide"s height.
    * @defaultValue false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Toggles the automatic change of slides
    * @defaultValue false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Stops sliding on mouseover.
    * @defaultValue false
    */
  var autoplayHoverPause: js.UndefOr[Boolean] = js.native
  
  /**
    * Pauses the sliding when the page is invisiable and resumes it when the page become visiable again
    * @defaultValue true
    */
  var autoplayResetOnVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Text or markup in the autoplay start/stop button.
    * @defaultValue ["start", "stop"]
    */
  var autoplayText: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Time between 2 autoplay slides change (in "ms").
    * @defaultValue 5000
    */
  var autoplayTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Controls the display and functionalities of controls components (prev/next buttons). If true, display the controls and add all functionalities.
    * @defaultValue true
    */
  var controls: js.UndefOr[Boolean] = js.native
  
  /**
    * Text or markup in the prev/next buttons
    * @defaultValue ["prev", "next"]
    */
  var controlsText: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Disable slider.
    * @defaultValue false
    */
  var disable: js.UndefOr[Boolean] = js.native
  
  /**
    * Space on the outside (in "px").
    * @defaultValue 0
    */
  var edgePadding: js.UndefOr[Double] = js.native
  
  /**
    * Controls width attribute of the slides.
    * @defaultValue false
    */
  var fixedWidth: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Space between slides (in "px").
    * @defaultValue 0
    */
  var gutter: js.UndefOr[Double] = js.native
  
  /**
    * Number of slides being displayed in the viewport.
    * @defaultValue 1
    */
  var items: js.UndefOr[Double] = js.native
  
  /**
    * Changing slides by dragging them.
    * @defaultValue false
    */
  var mouseDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the display and functionalities of nav components (dots). If true, display the nav and add all functionalities.
    * @defaultValue true
    */
  var nav: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of slides going on one "click".
    * @defaultValue 1
    */
  var slideBy: js.UndefOr[Double | page] = js.native
  
  /**
    * Speed of the slide animation (in "ms").
    * @defaultValue 300
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * The initial index of the slider.
    * @defaultValue 0
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * Activates input detection for touch devices.
    * @defaultValue true
    */
  var touch: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowKeys(value: Boolean): Self = this.set("arrowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowKeys: Self = this.set("arrowKeys", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplayHoverPause(value: Boolean): Self = this.set("autoplayHoverPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayHoverPause: Self = this.set("autoplayHoverPause", js.undefined)
    
    @scala.inline
    def setAutoplayResetOnVisibility(value: Boolean): Self = this.set("autoplayResetOnVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayResetOnVisibility: Self = this.set("autoplayResetOnVisibility", js.undefined)
    
    @scala.inline
    def setAutoplayTextVarargs(value: String*): Self = this.set("autoplayText", js.Array(value :_*))
    
    @scala.inline
    def setAutoplayText(value: js.Array[String]): Self = this.set("autoplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayText: Self = this.set("autoplayText", js.undefined)
    
    @scala.inline
    def setAutoplayTimeout(value: Double): Self = this.set("autoplayTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayTimeout: Self = this.set("autoplayTimeout", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setControlsTextVarargs(value: String*): Self = this.set("controlsText", js.Array(value :_*))
    
    @scala.inline
    def setControlsText(value: js.Array[String]): Self = this.set("controlsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsText: Self = this.set("controlsText", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEdgePadding(value: Double): Self = this.set("edgePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgePadding: Self = this.set("edgePadding", js.undefined)
    
    @scala.inline
    def setFixedWidth(value: Double | `false`): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMouseDrag(value: Boolean): Self = this.set("mouseDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseDrag: Self = this.set("mouseDrag", js.undefined)
    
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    
    @scala.inline
    def setSlideBy(value: Double | page): Self = this.set("slideBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideBy: Self = this.set("slideBy", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
  }
}
