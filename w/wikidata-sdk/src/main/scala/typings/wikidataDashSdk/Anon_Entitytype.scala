package typings.wikidataDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entitytype extends js.Object {
  var `entity-type`: String
  var `numeric-id`: Double
}

object Anon_Entitytype {
  @scala.inline
  def apply(`entity-type`: String, `numeric-id`: Double): Anon_Entitytype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity-type")(`entity-type`)
    __obj.updateDynamic("numeric-id")(`numeric-id`)
    __obj.asInstanceOf[Anon_Entitytype]
  }
}

