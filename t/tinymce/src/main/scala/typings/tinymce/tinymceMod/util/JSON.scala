package typings.tinymce.tinymceMod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON extends js.Object {
  def parse(s: String): js.Object = js.native
  def serialize(obj: js.Object): String = js.native
  def serialize(obj: js.Object, quote: String): String = js.native
}

