package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for video file properties. */
@js.native
trait SystemVideoProperties extends js.Object {
  
  /** Gets the name of the System.Video.Director property (one of the Windows video file properties). */
  var director: String = js.native
  
  /** Gets the name of the System.Video.FrameHeight property (one of the Windows video file properties). */
  var frameHeight: String = js.native
  
  /** Gets the name of the System.Video.FrameWidth property (one of the Windows video file properties). */
  var frameWidth: String = js.native
  
  /** Gets the name of the System.Video.Orientation property (one of the Windows video file properties). */
  var orientation: String = js.native
  
  /** Gets the name of the System.Video.TotalBitrate property (one of the Windows video file properties). */
  var totalBitrate: String = js.native
}
object SystemVideoProperties {
  
  @scala.inline
  def apply(
    director: String,
    frameHeight: String,
    frameWidth: String,
    orientation: String,
    totalBitrate: String
  ): SystemVideoProperties = {
    val __obj = js.Dynamic.literal(director = director.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], totalBitrate = totalBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemVideoProperties]
  }
  
  @scala.inline
  implicit class SystemVideoPropertiesOps[Self <: SystemVideoProperties] (val x: Self) extends AnyVal {
    
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
    def setDirector(value: String): Self = this.set("director", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeight(value: String): Self = this.set("frameHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidth(value: String): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBitrate(value: String): Self = this.set("totalBitrate", value.asInstanceOf[js.Any])
  }
}
