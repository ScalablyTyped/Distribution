package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cscrequired extends js.Object {
  var allowed: Boolean
  var csc_required: Boolean
  var items: js.Array[Id]
}

object Cscrequired {
  @scala.inline
  def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[Id]): Cscrequired = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], csc_required = csc_required.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cscrequired]
  }
}

