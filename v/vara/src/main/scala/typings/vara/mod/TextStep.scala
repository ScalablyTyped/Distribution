package typings.vara.mod

import typings.vara.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStep extends TextProperties {
  
  /**
    * Delay before the animation starts in milliseconds
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Whether the x or y coordinate should be from its calculated position,
    * ie the position if x or y coordinates were not applied
    */
  var fromCurrentPosition: js.UndefOr[X] = js.native
  
  /**
    * String or integer, for if animations are called manually or when using the get() method.
    * Default is the index of the object.
    */
  var id: js.UndefOr[String | Double] = js.native
  
  /**
    * Text to be shown
    */
  var text: String = js.native
  
  /**
    * x coordinate of the text
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * y coordinate of the text
    */
  var y: js.UndefOr[Double] = js.native
}
object TextStep {
  
  @scala.inline
  def apply(text: String): TextStep = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStep]
  }
  
  @scala.inline
  implicit class TextStepOps[Self <: TextStep] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFromCurrentPosition(value: X): Self = this.set("fromCurrentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromCurrentPosition: Self = this.set("fromCurrentPosition", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
