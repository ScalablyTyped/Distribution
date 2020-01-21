package typings.tern

import typings.tern.ternMod.PropertiesQuery
import typings.tern.ternMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultPropertiesQuery extends js.Object {
  var query: PropertiesQuery
  var result: PropertiesQueryResult
}

object AnonQueryResultPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): AnonQueryResultPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultPropertiesQuery]
  }
}

