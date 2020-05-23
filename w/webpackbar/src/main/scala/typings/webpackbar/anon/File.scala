package typings.webpackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  val file: Null | String
  val loaders: js.Array[String]
}

object File {
  @scala.inline
  def apply(loaders: js.Array[String], file: String = null): File = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

