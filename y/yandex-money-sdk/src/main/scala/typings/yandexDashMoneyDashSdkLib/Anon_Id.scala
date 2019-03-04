package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var pan_fragment: java.lang.String
  var `type`: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, pan_fragment: java.lang.String, `type`: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, pan_fragment = pan_fragment)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Id]
  }
}

