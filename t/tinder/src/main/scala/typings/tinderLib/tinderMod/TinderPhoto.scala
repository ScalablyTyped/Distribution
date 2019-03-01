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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("processedFiles")(processedFiles)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("xdistance_percent")(xdistance_percent)
    __obj.updateDynamic("xoffset_percent")(xoffset_percent)
    __obj.updateDynamic("ydistance_percent")(ydistance_percent)
    __obj.updateDynamic("yoffset_percent")(yoffset_percent)
    __obj.asInstanceOf[TinderPhoto]
  }
}

