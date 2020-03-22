package typings.tern

import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var query: TypeQuery
  var result: TypeQueryResult
}

object AnonResult {
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): AnonResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult]
  }
}

