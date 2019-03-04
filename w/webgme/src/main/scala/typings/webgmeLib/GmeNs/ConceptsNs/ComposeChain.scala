package typings
package webgmeLib.GmeNs.ConceptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeChain extends js.Object {
  var objId: java.lang.String
  var subCompId: js.UndefOr[java.lang.String]
}

object ComposeChain {
  @scala.inline
  def apply(objId: java.lang.String, subCompId: java.lang.String = null): ComposeChain = {
    val __obj = js.Dynamic.literal(objId = objId)
    if (subCompId != null) __obj.updateDynamic("subCompId")(subCompId)
    __obj.asInstanceOf[ComposeChain]
  }
}

