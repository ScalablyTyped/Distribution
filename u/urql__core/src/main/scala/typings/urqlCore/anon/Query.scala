package typings.urqlCore.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: DocumentNode
  var variables: js.UndefOr[js.Object] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: DocumentNode, variables: js.Object = null): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

