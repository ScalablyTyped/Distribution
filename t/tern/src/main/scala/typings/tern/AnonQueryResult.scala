package typings.tern

import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResult extends js.Object {
  var query: TypeQuery
  var result: TypeQueryResult
}

object AnonQueryResult {
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): AnonQueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResult]
  }
}

