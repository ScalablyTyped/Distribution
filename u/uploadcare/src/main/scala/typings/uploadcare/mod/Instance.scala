package typings.uploadcare.mod

import typings.uploadcare.anon.FromUrl
import typings.uploadcare.anon.Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var file: FromUrl
  var files: Remove
}

object Instance {
  @scala.inline
  def apply(file: FromUrl, files: Remove): Instance = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

