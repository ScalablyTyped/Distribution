package typings.yayson.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def get(model: js.Object): js.Any = js.native
  def get(model: js.Object, key: String): js.Any = js.native
  def id(model: js.Object): String = js.native
}

