package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Node {
  var definitions: js.Array[Definition]
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
}

object Document {
  @scala.inline
  def apply(definitions: js.Array[Definition], kind: String, loc: Location = null): Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

