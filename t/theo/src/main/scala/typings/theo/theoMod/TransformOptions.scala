package typings.theo.theoMod

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
  def apply[T /* <: String */](file: String, data: String = null, `type`: Transform | T = null): TransformOptions[T] = {
    val __obj = js.Dynamic.literal(file = file)
    if (data != null) __obj.updateDynamic("data")(data)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions[T]]
  }
}

