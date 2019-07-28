package typings.vegaDashLite.buildSrcDataMod

import typings.vegaDashLite.vegaDashLiteStrings.auto
import typings.vegaDashLite.vegaDashLiteStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoDataFormat
  extends DataFormatBase
     with DataFormat {
  /**
    * The name of the TopoJSON object set to convert to a GeoJSON feature collection.
    * For example, in a map of the world, there may be an object set named `"countries"`.
    * Using the feature property, we can extract this set and generate a GeoJSON feature object for each country.
    */
  var feature: js.UndefOr[String] = js.undefined
  /**
    * The name of the TopoJSON object set to convert to mesh.
    * Similar to the `feature` option, `mesh` extracts a named TopoJSON object set.
    *  Unlike the `feature` option, the corresponding geo data is returned as a single, unified mesh instance, not as individual GeoJSON features.
    * Extracting a mesh is useful for more efficiently drawing borders or other geographic elements that you do not need to associate with specific regions such as individual countries, states or counties.
    */
  var mesh: js.UndefOr[String] = js.undefined
  /**
    * Type of input data: `"json"`, `"csv"`, `"tsv"`, `"dsv"`.
    * The default format type is determined by the extension of the file URL.
    * If no extension is detected, `"json"` will be used by default.
    */
  var `type`: js.UndefOr[topojson] = js.undefined
}

object TopoDataFormat {
  @scala.inline
  def apply(feature: String = null, mesh: String = null, parse: auto | Parse = null, `type`: topojson = null): TopoDataFormat = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TopoDataFormat]
  }
}

