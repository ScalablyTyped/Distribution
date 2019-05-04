package typings
package vegaDashLiteLib.buildSrcCompileDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataComponent extends js.Object {
  /**
    * Parse properties passed down from ancestors. Helps us to keep track of what has been parsed or is derived.
    */
  var ancestorParse: js.UndefOr[AncestorParse] = js.undefined
  /**
    * For facets, we store the reference to the root node.
    */
  var facetRoot: js.UndefOr[vegaDashLiteLib.buildSrcCompileDataFacetMod.FacetNode] = js.undefined
  /**
    * True if the data for this model is faceted.
    * A dataset is faceted if a parent model is a facet and no new dataset is
    * defined (which would make the data unfaceted again).
    */
  var isFaceted: scala.Boolean
  /**
    * The main output node.
    */
  var main: js.UndefOr[vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode] = js.undefined
  /**
    * How often is an output node used. If it is not used, we don't need to
    * instantiate it in the assemble step.
    */
  var outputNodeRefCounts: vegaDashLiteLib.buildSrcUtilMod.Dict[scala.Double]
  /**
    * Registry of output nodes.
    */
  var outputNodes: vegaDashLiteLib.buildSrcUtilMod.Dict[
    vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode | vegaDashLiteLib.buildSrcCompileDataFacetMod.FacetNode
  ]
  /**
    * The output node before aggregation.
    */
  var raw: js.UndefOr[vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode] = js.undefined
  /**
    * A dictionary of sources indexed by a hash.
    */
  var sources: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcCompileDataSourceMod.SourceNode]
}

object DataComponent {
  @scala.inline
  def apply(
    isFaceted: scala.Boolean,
    outputNodeRefCounts: vegaDashLiteLib.buildSrcUtilMod.Dict[scala.Double],
    outputNodes: vegaDashLiteLib.buildSrcUtilMod.Dict[
      vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode | vegaDashLiteLib.buildSrcCompileDataFacetMod.FacetNode
    ],
    sources: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcCompileDataSourceMod.SourceNode],
    ancestorParse: AncestorParse = null,
    facetRoot: vegaDashLiteLib.buildSrcCompileDataFacetMod.FacetNode = null,
    main: vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode = null,
    raw: vegaDashLiteLib.buildSrcCompileDataDataflowMod.OutputNode = null
  ): DataComponent = {
    val __obj = js.Dynamic.literal(isFaceted = isFaceted, outputNodeRefCounts = outputNodeRefCounts, outputNodes = outputNodes, sources = sources)
    if (ancestorParse != null) __obj.updateDynamic("ancestorParse")(ancestorParse)
    if (facetRoot != null) __obj.updateDynamic("facetRoot")(facetRoot)
    if (main != null) __obj.updateDynamic("main")(main)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[DataComponent]
  }
}

