package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPhoto extends js.Object {
  var extension: String
  var fileName: String
  var id: String
  var main: Boolean
  var processedFiles: js.Array[TinderPhotoProcessedFile]
  var url: String
  var xdistance_percent: Double
  var xoffset_percent: Double
  var ydistance_percent: Double
  var yoffset_percent: Double
}

object TinderPhoto {
  @scala.inline
  def apply(
    extension: String,
    fileName: String,
    id: String,
    main: Boolean,
    processedFiles: js.Array[TinderPhotoProcessedFile],
    url: String,
    xdistance_percent: Double,
    xoffset_percent: Double,
    ydistance_percent: Double,
    yoffset_percent: Double
  ): TinderPhoto = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], processedFiles = processedFiles.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdistance_percent = xdistance_percent.asInstanceOf[js.Any], xoffset_percent = xoffset_percent.asInstanceOf[js.Any], ydistance_percent = ydistance_percent.asInstanceOf[js.Any], yoffset_percent = yoffset_percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TinderPhoto]
  }
}

