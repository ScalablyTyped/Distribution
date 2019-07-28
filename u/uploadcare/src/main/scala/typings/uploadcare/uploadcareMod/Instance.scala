package typings.uploadcare.uploadcareMod

import typings.uploadcare.Anon_Callback
import typings.uploadcare.Anon_CallbackErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var file: Anon_Callback
  var files: Anon_CallbackErr
}

object Instance {
  @scala.inline
  def apply(file: Anon_Callback, files: Anon_CallbackErr): Instance = {
    val __obj = js.Dynamic.literal(file = file, files = files)
  
    __obj.asInstanceOf[Instance]
  }
}

