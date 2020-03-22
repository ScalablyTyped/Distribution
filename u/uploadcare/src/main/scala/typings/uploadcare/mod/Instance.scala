package typings.uploadcare.mod

import typings.uploadcare.AnonFromUrl
import typings.uploadcare.AnonRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var file: AnonFromUrl
  var files: AnonRemove
}

object Instance {
  @scala.inline
  def apply(file: AnonFromUrl, files: AnonRemove): Instance = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Instance]
  }
}

