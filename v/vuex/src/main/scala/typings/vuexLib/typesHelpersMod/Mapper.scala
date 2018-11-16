package typings
package vuexLib.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapper[R] extends js.Object {
  def apply(map: js.Array[java.lang.String]): Dictionary[R] = js.native
  def apply(map: Dictionary[java.lang.String]): Dictionary[R] = js.native
}

