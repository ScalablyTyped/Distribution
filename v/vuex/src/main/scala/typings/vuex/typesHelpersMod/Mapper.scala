package typings.vuex.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapper[R] extends js.Object {
  def apply(map: js.Array[String]): Dictionary[R] = js.native
  def apply(map: Dictionary[String]): Dictionary[R] = js.native
}

