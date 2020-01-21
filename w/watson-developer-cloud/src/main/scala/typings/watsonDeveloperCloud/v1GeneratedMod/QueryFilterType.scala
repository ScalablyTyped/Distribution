package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryFilterType. */
trait QueryFilterType extends js.Object {
  /** A comma-separated list of types to exclude. */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /** A comma-separated list of types to include. All other types are excluded. */
  var include: js.UndefOr[js.Array[String]] = js.undefined
}

object QueryFilterType {
  @scala.inline
  def apply(exclude: js.Array[String] = null, include: js.Array[String] = null): QueryFilterType = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilterType]
  }
}

