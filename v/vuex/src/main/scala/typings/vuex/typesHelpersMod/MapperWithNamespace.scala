package typings.vuex.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapperWithNamespace[R] extends js.Object {
  def apply(namespace: String, map: js.Array[String]): Dictionary[R] = js.native
  def apply(namespace: String, map: Dictionary[String]): Dictionary[R] = js.native
}

