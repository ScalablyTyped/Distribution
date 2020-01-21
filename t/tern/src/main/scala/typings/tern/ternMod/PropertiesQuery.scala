package typings.tern.ternMod

import typings.tern.ternStrings.full
import typings.tern.ternStrings.properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesQuery extends BaseQuery {
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[String] = js.undefined
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.undefined
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: properties
}

object PropertiesQuery {
  @scala.inline
  def apply(
    `type`: properties,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    sort: js.UndefOr[Boolean] = js.undefined
  ): PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQuery]
  }
}

