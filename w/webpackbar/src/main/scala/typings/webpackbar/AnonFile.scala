package typings.webpackbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  val file: Null | String
  val loaders: js.Array[String]
}

object AnonFile {
  @scala.inline
  def apply(loaders: js.Array[String], file: String = null): AnonFile = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

