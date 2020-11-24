package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumTrackTintColor extends js.Object {
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var thumbSize: js.UndefOr[Double] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var trackHeight: js.UndefOr[Double] = js.native
  
  var trackRadius: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MaximumTrackTintColor {
  
  @scala.inline
  def apply(): MaximumTrackTintColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumTrackTintColor]
  }
  
  @scala.inline
  implicit class MaximumTrackTintColorOps[Self <: MaximumTrackTintColor] (val x: Self) extends AnyVal {
    
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
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbSize: Self = this.set("thumbSize", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = this.set("trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHeight: Self = this.set("trackHeight", js.undefined)
    
    @scala.inline
    def setTrackRadius(value: Double): Self = this.set("trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackRadius: Self = this.set("trackRadius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
