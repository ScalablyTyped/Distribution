package typings
package xmlDashParserLib.xmlDashParserMod.parseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var declaration: Declaration
  var root: Node
}

object Document {
  @scala.inline
  def apply(declaration: Declaration, root: Node): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("declaration")(declaration)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Document]
  }
}

