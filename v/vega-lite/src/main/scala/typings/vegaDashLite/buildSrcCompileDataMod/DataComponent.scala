package typings.vegaDashLite.buildSrcCompileDataMod

import typings.vegaDashLite.buildSrcCompileDataDataflowMod.OutputNode
import typings.vegaDashLite.buildSrcCompileDataFacetMod.FacetNode
import typings.vegaDashLite.buildSrcCompileDataSourceMod.SourceNode
import typings.vegaDashLite.buildSrcUtilMod.Dict
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
  var facetRoot: js.UndefOr[FacetNode] = js.undefined
  /**
    * True if the data for this model is faceted.
    * A dataset is faceted if a parent model is a facet and no new dataset is
    * defined (which would make the data unfaceted again).
    */
  var isFaceted: Boolean
  /**
    * The main output node.
    */
  var main: js.UndefOr[OutputNode] = js.undefined
  /**
    * How often is an output node used. If it is not used, we don't need to
    * instantiate it in the assemble step.
    */
  var outputNodeRefCounts: Dict[Double]
  /**
    * Registry of output nodes.
    */
  var outputNodes: Dict[OutputNode | FacetNode]
  /**
    * The output node before aggregation.
    */
  var raw: js.UndefOr[OutputNode] = js.undefined
  /**
    * A dictionary of sources indexed by a hash.
    */
  var sources: Dict[SourceNode]
}

object DataComponent {
  @scala.inline
  def apply(
    isFaceted: Boolean,
    outputNodeRefCounts: Dict[Double],
    outputNodes: Dict[OutputNode | FacetNode],
    sources: Dict[SourceNode],
    ancestorParse: AncestorParse = null,
    facetRoot: FacetNode = null,
    main: OutputNode = null,
    raw: OutputNode = null
  ): DataComponent = {
    val __obj = js.Dynamic.literal(isFaceted = isFaceted, outputNodeRefCounts = outputNodeRefCounts, outputNodes = outputNodes, sources = sources)
    if (ancestorParse != null) __obj.updateDynamic("ancestorParse")(ancestorParse)
    if (facetRoot != null) __obj.updateDynamic("facetRoot")(facetRoot)
    if (main != null) __obj.updateDynamic("main")(main)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[DataComponent]
  }
}

