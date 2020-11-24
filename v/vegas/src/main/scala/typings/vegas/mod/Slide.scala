package typings.vegas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slide extends js.Object {
  
  /**
    * Horizontal alignment of the image in the slide.
    * @default 'center'
    */
  var align: js.UndefOr[AlignType] = js.native
  
  /**
    * Set the animation of this slide.
    * Could be an animation name, `random` or an array of transition picked randomly.
    * {@link http://vegas.jaysalvat.com/documentation/transitions/}
    */
  var animation: js.UndefOr[AnimationType] = js.native
  
  /**
    * Set the animation duration in milliseconds.
    * Could be `auto` so the animation duration will be equal to the slide delay .
    */
  var animationDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Slide background color.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * `true` the background image is scaled to fit the container.
    * `false` the background image is displayed entirely.
    * @default true
    */
  var cover: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay beetween slides in milliseconds.
    * @default 5_000
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Path of the image.
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * Set the transition of this slide.
    * Could be a transition name, random or an array of transition picked randomly.
    * {@link http://vegas.jaysalvat.com/documentation/transitions/}
    * @default 'fade'
    */
  var transition: js.UndefOr[TransitionType] = js.native
  
  /**
    * Set the transition duration in milliseconds.
    * Could be `auto` so the transition duration will be equal to the slide delay .
    * @default 1_000
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Vertical alignment of the image in the slide.
    * @default 'center'
    */
  var valing: js.UndefOr[AlignType] = js.native
  
  /**
    * {@link http://vegas.jaysalvat.com/documentation/settings/#videos}
    */
  var video: js.UndefOr[Video] = js.native
}
object Slide {
  
  @scala.inline
  def apply(): Slide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slide]
  }
  
  @scala.inline
  implicit class SlideOps[Self <: Slide] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAnimationVarargs(value: Animation*): Self = this.set("animation", js.Array(value :_*))
    
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Duration): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCover(value: Boolean): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setTransitionVarargs(value: Transition*): Self = this.set("transition", js.Array(value :_*))
    
    @scala.inline
    def setTransition(value: TransitionType): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setValing(value: AlignType): Self = this.set("valing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValing: Self = this.set("valing", js.undefined)
    
    @scala.inline
    def setVideo(value: Video): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
