package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.audio
import typings.xrm.xrmStrings.image
import typings.xrm.xrmStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Possible file types for Xrm.Device.pickFile options
  * @see {@link Xrm.Device.PickFileTypes}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.audio
  - typings.xrm.xrmStrings.video
  - typings.xrm.xrmStrings.image
*/
trait DevicePickFileType extends StObject
object DevicePickFileType {
  
  @scala.inline
  def Audio: audio = "audio".asInstanceOf[audio]
  
  @scala.inline
  def Image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def Video: video = "video".asInstanceOf[video]
}
