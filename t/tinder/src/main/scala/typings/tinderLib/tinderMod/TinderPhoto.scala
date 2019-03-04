package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPhoto extends js.Object {
  var extension: java.lang.String
  var fileName: java.lang.String
  var id: java.lang.String
  var main: scala.Boolean
  var processedFiles: js.Array[TinderPhotoProcessedFile]
  var url: java.lang.String
  var xdistance_percent: scala.Double
  var xoffset_percent: scala.Double
  var ydistance_percent: scala.Double
  var yoffset_percent: scala.Double
}

object TinderPhoto {
  @scala.inline
  def apply(
    extension: java.lang.String,
    fileName: java.lang.String,
    id: java.lang.String,
    main: scala.Boolean,
    processedFiles: js.Array[TinderPhotoProcessedFile],
    url: java.lang.String,
    xdistance_percent: scala.Double,
    xoffset_percent: scala.Double,
    ydistance_percent: scala.Double,
    yoffset_percent: scala.Double
  ): TinderPhoto = {
    val __obj = js.Dynamic.literal(extension = extension, fileName = fileName, id = id, main = main, processedFiles = processedFiles, url = url, xdistance_percent = xdistance_percent, xoffset_percent = xoffset_percent, ydistance_percent = ydistance_percent, yoffset_percent = yoffset_percent)
  
    __obj.asInstanceOf[TinderPhoto]
  }
}

