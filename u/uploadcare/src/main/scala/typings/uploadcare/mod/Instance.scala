package typings.uploadcare.mod

import typings.uploadcare.AnonCallback
import typings.uploadcare.AnonCallbackErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var file: AnonCallback
  var files: AnonCallbackErr
}

object Instance {
  @scala.inline
  def apply(file: AnonCallback, files: AnonCallbackErr): Instance = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Instance]
  }
}

