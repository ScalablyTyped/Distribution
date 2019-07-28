package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregateIdentity extends js.Object {
  var aggregateIdentity: Double
  var importedIdentity: Double
  var none: Double
  var serviceIdentity: Double
}

object Anon_AggregateIdentity {
  @scala.inline
  def apply(aggregateIdentity: Double, importedIdentity: Double, none: Double, serviceIdentity: Double): Anon_AggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity, importedIdentity = importedIdentity, none = none, serviceIdentity = serviceIdentity)
  
    __obj.asInstanceOf[Anon_AggregateIdentity]
  }
}

