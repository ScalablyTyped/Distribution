package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.FieldDef
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcSortMod.SortFields
import typings.vegaLite.buildSrcStackMod.StackOffset
import typings.vegaLite.buildSrcTransformMod.StackTransform
import typings.vegaTypings.typesSpecTransformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataStackMod {
  
  @JSImport("vega-lite/build/src/compile/data/stack", "StackNode")
  @js.native
  open class StackNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, stack: StackComponent) = this()
    
    /* private */ var _stack: Any = js.native
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): js.Array[Transforms] = js.native
    
    /* private */ var getGroupbyFields: Any = js.native
    
    def stack: StackComponent = js.native
  }
  /* static members */
  object StackNode {
    
    @JSImport("vega-lite/build/src/compile/data/stack", "StackNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: UnitModel): StackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[StackNode]
    
    inline def makeFromTransform(parent: DataFlowNode, stackTransform: StackTransform): StackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], stackTransform.asInstanceOf[js.Any])).asInstanceOf[StackNode]
  }
  
  trait StackComponent extends StObject {
    
    /**
      * Output field names of each stack field.
      */
    var as: js.Tuple2[FieldName, FieldName]
    
    var dimensionFieldDefs: js.Array[FieldDef[String, Any]]
    
    /**
      * Faceted field.
      */
    var facetby: js.Array[String]
    
    /**
      * The data fields to group by.
      */
    var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
    
    /**
      * Whether to impute the data before stacking. Used only in makeFromEncoding.
      */
    var impute: js.UndefOr[Boolean] = js.undefined
    
    /** Mode for stacking marks.
      */
    var offset: StackOffset
    
    /**
      * Field that determines order of levels in the stacked charts.
      * Used in both but optional in transform.
      */
    var sort: SortFields
    
    /**
      * Stack measure's field. Used in makeFromEncoding.
      */
    var stackField: String
    
    /**
      * Level of detail fields for each level in the stacked charts such as color or detail.
      * Used in makeFromEncoding.
      */
    var stackby: js.UndefOr[js.Array[String]] = js.undefined
  }
  object StackComponent {
    
    inline def apply(
      as: js.Tuple2[FieldName, FieldName],
      dimensionFieldDefs: js.Array[FieldDef[String, Any]],
      facetby: js.Array[String],
      offset: StackOffset,
      sort: SortFields,
      stackField: String
    ): StackComponent = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], dimensionFieldDefs = dimensionFieldDefs.asInstanceOf[js.Any], facetby = facetby.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], stackField = stackField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackComponent]
    }
    
    extension [Self <: StackComponent](x: Self) {
      
      inline def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setDimensionFieldDefs(value: js.Array[FieldDef[String, Any]]): Self = StObject.set(x, "dimensionFieldDefs", value.asInstanceOf[js.Any])
      
      inline def setDimensionFieldDefsVarargs(value: (FieldDef[String, Any])*): Self = StObject.set(x, "dimensionFieldDefs", js.Array(value*))
      
      inline def setFacetby(value: js.Array[String]): Self = StObject.set(x, "facetby", value.asInstanceOf[js.Any])
      
      inline def setFacetbyVarargs(value: String*): Self = StObject.set(x, "facetby", js.Array(value*))
      
      inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
      
      inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
      
      inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
      
      inline def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      inline def setImputeUndefined: Self = StObject.set(x, "impute", js.undefined)
      
      inline def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSort(value: SortFields): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackby(value: js.Array[String]): Self = StObject.set(x, "stackby", value.asInstanceOf[js.Any])
      
      inline def setStackbyUndefined: Self = StObject.set(x, "stackby", js.undefined)
      
      inline def setStackbyVarargs(value: String*): Self = StObject.set(x, "stackby", js.Array(value*))
    }
  }
}
