package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderPhoto extends js.Object {
  var extension: String = js.native
  var fileName: String = js.native
  var id: String = js.native
  var main: Boolean = js.native
  var processedFiles: js.Array[TinderPhotoProcessedFile] = js.native
  var url: String = js.native
  var xdistance_percent: Double = js.native
  var xoffset_percent: Double = js.native
  var ydistance_percent: Double = js.native
  var yoffset_percent: Double = js.native
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
  @scala.inline
  implicit class TinderPhotoOps[Self <: TinderPhoto] (val x: Self) extends AnyVal {
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
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMain(value: Boolean): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessedFilesVarargs(value: TinderPhotoProcessedFile*): Self = this.set("processedFiles", js.Array(value :_*))
    @scala.inline
    def setProcessedFiles(value: js.Array[TinderPhotoProcessedFile]): Self = this.set("processedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setXdistance_percent(value: Double): Self = this.set("xdistance_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setXoffset_percent(value: Double): Self = this.set("xoffset_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setYdistance_percent(value: Double): Self = this.set("ydistance_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setYoffset_percent(value: Double): Self = this.set("yoffset_percent", value.asInstanceOf[js.Any])
  }
  
}

