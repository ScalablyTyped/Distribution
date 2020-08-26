package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
@js.native
trait HttpContentDispositionHeaderValue extends js.Object {
  /** Gets or sets the value of the disposition-type information in the Content-Disposition HTTP header. */
  var dispositionType: String = js.native
  /** Gets or sets the value of the filename-parm information in the Content-Disposition HTTP header for a single file. */
  var fileName: String = js.native
  /** Gets or sets the value of the filename-parm characteristic in the Content-Disposition HTTP header for multiple files. */
  var fileNameStar: String = js.native
  /** Gets or sets the name for a content body part in the Content-Disposition HTTP header. */
  var name: String = js.native
  /** Gets a set of parameters included in the Content-Disposition HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets or sets the approximate size, in bytes, of the file used in the Content-Disposition HTTP header. */
  var size: Double = js.native
}

object HttpContentDispositionHeaderValue {
  @scala.inline
  def apply(
    dispositionType: String,
    fileName: String,
    fileNameStar: String,
    name: String,
    parameters: IVector[HttpNameValueHeaderValue],
    size: Double
  ): HttpContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(dispositionType = dispositionType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileNameStar = fileNameStar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentDispositionHeaderValue]
  }
  @scala.inline
  implicit class HttpContentDispositionHeaderValueOps[Self <: HttpContentDispositionHeaderValue] (val x: Self) extends AnyVal {
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
    def setDispositionType(value: String): Self = this.set("dispositionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileNameStar(value: String): Self = this.set("fileNameStar", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

