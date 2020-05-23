package typings.yaml.typesMod.Schema

import typings.yaml.typesMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Array of additional tags to include in the schema, or a function that may
    * modify the schema's base tag array.
    */
  var customTags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.undefined
  /**
    * Enable support for `<<` merge keys.
    *
    * Default: `false` for YAML 1.2, `true` for earlier versions
    */
  var merge: js.UndefOr[Boolean] = js.undefined
  /**
    * The base schema to use.
    *
    * Default: `"core"` for YAML 1.2, `"yaml-1.1"` for earlier versions
    */
  var schema: js.UndefOr[Name] = js.undefined
  /**
    * When stringifying, sort map entries. If `true`, sort by comparing key values with `<`.
    *
    * Default: `false`
    */
  var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])] = js.undefined
  /**
    * @deprecated Use `customTags` instead.
    */
  var tags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    customTags: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    schema: Name = null,
    sortMapEntries: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double]) = null,
    tags: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (customTags != null) __obj.updateDynamic("customTags")(customTags.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (sortMapEntries != null) __obj.updateDynamic("sortMapEntries")(sortMapEntries.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

