package typings.tinder.tinderMod

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
    val __obj = js.Dynamic.literal(extension = extension, fileName = fileName, id = id, main = main, processedFiles = processedFiles, url = url, xdistance_percent = xdistance_percent, xoffset_percent = xoffset_percent, ydistance_percent = ydistance_percent, yoffset_percent = yoffset_percent)
  
    __obj.asInstanceOf[TinderPhoto]
  }
}

