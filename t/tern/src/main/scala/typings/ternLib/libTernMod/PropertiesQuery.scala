package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesQuery extends BaseQuery {
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: ternLib.ternLibStrings.properties
}

object PropertiesQuery {
  @scala.inline
  def apply(
    `type`: ternLib.ternLibStrings.properties,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertiesQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[PropertiesQuery]
  }
}

