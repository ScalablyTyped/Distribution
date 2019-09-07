package typings.atTensorflowTfjsDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var `type`: Double
  var value: Double
}

object Anon_Name {
  @scala.inline
  def apply(name: String, `type`: Double, value: Double): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

