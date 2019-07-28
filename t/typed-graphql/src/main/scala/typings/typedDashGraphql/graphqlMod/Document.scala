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
    val __obj = js.Dynamic.literal(definitions = definitions, kind = kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Document]
  }
}

