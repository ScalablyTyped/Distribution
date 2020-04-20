package typings.twig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var filename: String
  var settings: js.Any
}

object CompileOptions {
  @scala.inline
  def apply(filename: String, settings: js.Any): CompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOptions]
  }
}

