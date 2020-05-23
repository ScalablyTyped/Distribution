package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions[T /* <: String */] extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var file: String
  var `type`: js.UndefOr[Transform | T] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply[T](file: String, data: String = null, `type`: Transform | T = null): TransformOptions[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions[T]]
  }
}

