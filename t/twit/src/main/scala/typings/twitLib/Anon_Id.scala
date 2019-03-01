package typings
package twitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: scala.Double
  var id_str: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: scala.Double, id_str: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("id_str")(id_str)
    __obj.asInstanceOf[Anon_Id]
  }
}

