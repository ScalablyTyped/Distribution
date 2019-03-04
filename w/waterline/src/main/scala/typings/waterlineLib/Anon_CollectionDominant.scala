package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionDominant extends js.Object {
  var collection: java.lang.String
  var dominant: js.UndefOr[scala.Boolean] = js.undefined
  var via: java.lang.String
}

object Anon_CollectionDominant {
  @scala.inline
  def apply(
    collection: java.lang.String,
    via: java.lang.String,
    dominant: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CollectionDominant = {
    val __obj = js.Dynamic.literal(collection = collection, via = via)
    if (!js.isUndefined(dominant)) __obj.updateDynamic("dominant")(dominant)
    __obj.asInstanceOf[Anon_CollectionDominant]
  }
}

