package typings.vegaDashLite.buildSrcCompileFacetMod

import typings.vegaDashLite.buildSrcFacetMod.FacetFieldDef
import typings.vegaDashLite.buildSrcSortMod.EncodingSortField
import typings.vegaDashLite.vegaDashLiteStrings.datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/facet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def facetSortFieldName(fieldDef: FacetFieldDef[String], sort: EncodingSortField[String]): String = js.native
  @JSName("facetSortFieldName")
  def facetSortFieldName_datum(fieldDef: FacetFieldDef[String], sort: EncodingSortField[String], expr: datum): String = js.native
}

