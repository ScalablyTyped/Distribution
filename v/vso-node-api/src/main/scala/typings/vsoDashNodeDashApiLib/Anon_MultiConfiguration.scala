package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MultiConfiguration extends js.Object {
  var multiConfiguration: scala.Double
  var multiMachine: scala.Double
  var none: scala.Double
}

object Anon_MultiConfiguration {
  @scala.inline
  def apply(multiConfiguration: scala.Double, multiMachine: scala.Double, none: scala.Double): Anon_MultiConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("multiConfiguration")(multiConfiguration)
    __obj.updateDynamic("multiMachine")(multiMachine)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_MultiConfiguration]
  }
}

