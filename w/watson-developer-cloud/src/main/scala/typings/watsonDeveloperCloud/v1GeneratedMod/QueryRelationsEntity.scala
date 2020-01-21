package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsEntity. */
trait QueryRelationsEntity extends js.Object {
  /** If false, implicit querying is performed. The default is `false`. */
  var exact: js.UndefOr[Boolean] = js.undefined
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryRelationsEntity {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined, text: String = null, `type`: String = null): QueryRelationsEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRelationsEntity]
  }
}

