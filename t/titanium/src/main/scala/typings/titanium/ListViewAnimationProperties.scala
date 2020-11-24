package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object for specifying the animation properties to use when inserting or deleting
  * sections or cells, or scrolling the list.
  */
@js.native
trait ListViewAnimationProperties extends js.Object {
  
  /**
    * Whether this list change should be animated. Ignored if any `animationStyle` value is specified.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of animation to use for cell insertions and deletions.
    */
  var animationStyle: js.UndefOr[Double] = js.native
  
  /**
    * Specifies what position to scroll the selected cell to.
    */
  var position: js.UndefOr[Double] = js.native
}
object ListViewAnimationProperties {
  
  @scala.inline
  def apply(): ListViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewAnimationProperties]
  }
  
  @scala.inline
  implicit class ListViewAnimationPropertiesOps[Self <: ListViewAnimationProperties] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimationStyle(value: Double): Self = this.set("animationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationStyle: Self = this.set("animationStyle", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
