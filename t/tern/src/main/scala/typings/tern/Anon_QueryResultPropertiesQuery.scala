package typings.tern

import typings.tern.libTernMod.PropertiesQuery
import typings.tern.libTernMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultPropertiesQuery extends js.Object {
  var query: PropertiesQuery
  var result: PropertiesQueryResult
}

object Anon_QueryResultPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): Anon_QueryResultPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultPropertiesQuery]
  }
}

