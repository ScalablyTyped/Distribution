package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinitionNameAscending extends js.Object {
  var definitionNameAscending: Double
  var definitionNameDescending: Double
  var lastModifiedAscending: Double
  var lastModifiedDescending: Double
  var none: Double
}

object AnonDefinitionNameAscending {
  @scala.inline
  def apply(
    definitionNameAscending: Double,
    definitionNameDescending: Double,
    lastModifiedAscending: Double,
    lastModifiedDescending: Double,
    none: Double
  ): AnonDefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefinitionNameAscending]
  }
}

