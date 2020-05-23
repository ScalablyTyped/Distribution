package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionNameAscending extends js.Object {
  var definitionNameAscending: scala.Double
  var definitionNameDescending: scala.Double
  var lastModifiedAscending: scala.Double
  var lastModifiedDescending: scala.Double
  var none: scala.Double
}

object DefinitionNameAscending {
  @scala.inline
  def apply(
    definitionNameAscending: scala.Double,
    definitionNameDescending: scala.Double,
    lastModifiedAscending: scala.Double,
    lastModifiedDescending: scala.Double,
    none: scala.Double
  ): DefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNameAscending]
  }
}

