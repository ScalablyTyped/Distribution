package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateIdentity extends js.Object {
  var aggregateIdentity: scala.Double
  var importedIdentity: scala.Double
  var none: scala.Double
  var serviceIdentity: scala.Double
}

object AggregateIdentity {
  @scala.inline
  def apply(
    aggregateIdentity: scala.Double,
    importedIdentity: scala.Double,
    none: scala.Double,
    serviceIdentity: scala.Double
  ): AggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity.asInstanceOf[js.Any], importedIdentity = importedIdentity.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceIdentity = serviceIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateIdentity]
  }
}

