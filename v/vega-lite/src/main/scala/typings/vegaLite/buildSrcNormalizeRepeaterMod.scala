package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typings.vegaLite.buildSrcSpecFacetMod.FacetMapping
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeRepeaterMod {
  
  @JSImport("vega-lite/build/src/normalize/repeater", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceRepeaterInEncoding[E /* <: Encoding[Field] */](encoding: E, repeater: RepeaterValue): Encoding[FieldName] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInEncoding")(encoding.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[Encoding[FieldName]]
  
  inline def replaceRepeaterInFacet(facet: FacetFieldDef[Field, ExprRef | SignalRef], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInFacet")(facet.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[(FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]])]
  inline def replaceRepeaterInFacet(facet: FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInFacet")(facet.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[(FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]])]
  
  trait RepeaterValue extends StObject {
    
    var column: js.UndefOr[String] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var repeat: js.UndefOr[String] = js.undefined
    
    var row: js.UndefOr[String] = js.undefined
  }
  object RepeaterValue {
    
    inline def apply(): RepeaterValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeaterValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepeaterValue] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
