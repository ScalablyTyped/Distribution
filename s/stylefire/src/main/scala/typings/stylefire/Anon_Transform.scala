package typings.stylefire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transform extends js.Object {
  var transform: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object Anon_Transform {
  @scala.inline
  def apply(transform: String = null, transformOrigin: String = null): Anon_Transform = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    __obj.asInstanceOf[Anon_Transform]
  }
}

