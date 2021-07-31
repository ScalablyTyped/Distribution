package typings.vegaLite

import typings.vegaLite.dataflowMod.OutputNode
import typings.vegaLite.facetMod.FacetNode
import typings.vegaLite.sourceMod.SourceNode
import typings.vegaLite.splitMod.Split
import typings.vegaLite.srcDataMod.Parse
import typings.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("vega-lite/build/src/compile/data", "AncestorParse")
  @js.native
  class AncestorParse () extends Split[Parse] {
    def this(explicit: js.Object) = this()
    def this(explicit: js.Object, `implicit`: js.Object) = this()
    def this(explicit: Unit, `implicit`: js.Object) = this()
    def this(explicit: js.Object, `implicit`: js.Object, parseNothing: Boolean) = this()
    def this(explicit: js.Object, `implicit`: Unit, parseNothing: Boolean) = this()
    def this(explicit: Unit, `implicit`: js.Object, parseNothing: Boolean) = this()
    def this(explicit: Unit, `implicit`: Unit, parseNothing: Boolean) = this()
    
    var parseNothing: Boolean = js.native
  }
  
  trait DataComponent extends StObject {
    
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
      * A list of unique sources.
      */
    var sources: js.Array[SourceNode]
  }
  object DataComponent {
    
    @scala.inline
    def apply(
      isFaceted: Boolean,
      outputNodeRefCounts: Dict[Double],
      outputNodes: Dict[OutputNode | FacetNode],
      sources: js.Array[SourceNode]
    ): DataComponent = {
      val __obj = js.Dynamic.literal(isFaceted = isFaceted.asInstanceOf[js.Any], outputNodeRefCounts = outputNodeRefCounts.asInstanceOf[js.Any], outputNodes = outputNodes.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataComponent]
    }
    
    @scala.inline
    implicit class DataComponentMutableBuilder[Self <: DataComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAncestorParse(value: AncestorParse): Self = StObject.set(x, "ancestorParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAncestorParseUndefined: Self = StObject.set(x, "ancestorParse", js.undefined)
      
      @scala.inline
      def setFacetRoot(value: FacetNode): Self = StObject.set(x, "facetRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetRootUndefined: Self = StObject.set(x, "facetRoot", js.undefined)
      
      @scala.inline
      def setIsFaceted(value: Boolean): Self = StObject.set(x, "isFaceted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: OutputNode): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setOutputNodeRefCounts(value: Dict[Double]): Self = StObject.set(x, "outputNodeRefCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputNodes(value: Dict[OutputNode | FacetNode]): Self = StObject.set(x, "outputNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: OutputNode): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[SourceNode]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: SourceNode*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
}
