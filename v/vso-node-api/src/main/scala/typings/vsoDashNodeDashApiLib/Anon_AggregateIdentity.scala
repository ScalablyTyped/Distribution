package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregateIdentity extends js.Object {
  var aggregateIdentity: scala.Double
  var importedIdentity: scala.Double
  var none: scala.Double
  var serviceIdentity: scala.Double
}

object Anon_AggregateIdentity {
  @scala.inline
  def apply(
    aggregateIdentity: scala.Double,
    importedIdentity: scala.Double,
    none: scala.Double,
    serviceIdentity: scala.Double
  ): Anon_AggregateIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregateIdentity")(aggregateIdentity)
    __obj.updateDynamic("importedIdentity")(importedIdentity)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("serviceIdentity")(serviceIdentity)
    __obj.asInstanceOf[Anon_AggregateIdentity]
  }
}

