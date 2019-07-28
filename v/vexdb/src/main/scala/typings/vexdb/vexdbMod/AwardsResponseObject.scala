package typings.vexdb.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwardsResponseObject extends ResponseObject {
  var name: String
  var order: Double
  var qualifies: js.Array[String]
  var sku: String
  var team: String
}

object AwardsResponseObject {
  @scala.inline
  def apply(name: String, order: Double, qualifies: js.Array[String], sku: String, team: String): AwardsResponseObject = {
    val __obj = js.Dynamic.literal(name = name, order = order, qualifies = qualifies, sku = sku, team = team)
  
    __obj.asInstanceOf[AwardsResponseObject]
  }
}

