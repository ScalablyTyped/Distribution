package typings
package vuexLib.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapperWithNamespace[R] extends js.Object {
  def apply(namespace: java.lang.String, map: js.Array[java.lang.String]): Dictionary[R] = js.native
  def apply(namespace: java.lang.String, map: Dictionary[java.lang.String]): Dictionary[R] = js.native
}

