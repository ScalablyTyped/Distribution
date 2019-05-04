package typings
package vegaDashLiteLib.buildSrcCompileFacetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/facet", "FacetModel")
@js.native
class FacetModel protected ()
  extends vegaDashLiteLib.buildSrcCompileModelMod.ModelWithField {
  def this(spec: vegaDashLiteLib.buildSrcSpecMod.NormalizedFacetSpec, parent: vegaDashLiteLib.buildSrcCompileModelMod.Model, parentGivenName: java.lang.String, repeater: vegaDashLiteLib.buildSrcCompileRepeaterMod.RepeaterValue, config: vegaDashLiteLib.buildSrcConfigMod.Config) = this()
  var assembleFacet: js.Any = js.native
  val child: vegaDashLiteLib.buildSrcCompileModelMod.Model = js.native
  var columnDistinctSignal: js.Any = js.native
  val facet: vegaDashLiteLib.buildSrcFacetMod.FacetMapping[java.lang.String] = js.native
  /**
    * Aggregate cardinality for calculating size
    */
  var getCardinalityAggregateForChild: js.Any = js.native
  var getHeaderLayoutMixins: js.Any = js.native
  var headerSortFields: js.Any = js.native
  var headerSortOrder: js.Any = js.native
  var initFacet: js.Any = js.native
  var makeHeaderComponent: js.Any = js.native
  var mergeChildAxis: js.Any = js.native
  var parseHeader: js.Any = js.native
  @JSName("type")
  val type_FacetModel: vegaDashLiteLib.vegaDashLiteLibStrings.facet = js.native
  def fieldDef(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String] = js.native
}

