package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeT[T /* <: java.lang.String */] extends js.Object {
  var `type`: T
}

object Anon_TypeT {
  @scala.inline
  def apply[T /* <: java.lang.String */](`type`: T): Anon_TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeT[T]]
  }
}

