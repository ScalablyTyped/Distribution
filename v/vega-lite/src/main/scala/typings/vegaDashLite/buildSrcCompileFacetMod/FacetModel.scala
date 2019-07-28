package typings.vegaDashLite.buildSrcCompileFacetMod

import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcFacetMod.FacetMapping
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcSpecMod.NormalizedFacetSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/facet", "FacetModel")
@js.native
class FacetModel protected () extends ModelWithField {
  def this(
    spec: NormalizedFacetSpec,
    parent: Model,
    parentGivenName: String,
    repeater: RepeaterValue,
    config: Config
  ) = this()
  var assembleFacet: js.Any = js.native
  val child: Model = js.native
  var columnDistinctSignal: js.Any = js.native
  val facet: FacetMapping[String] = js.native
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
  val type_FacetModel: typings.vegaDashLite.vegaDashLiteStrings.facet = js.native
  def fieldDef(channel: Channel): FieldDef[String] = js.native
}

