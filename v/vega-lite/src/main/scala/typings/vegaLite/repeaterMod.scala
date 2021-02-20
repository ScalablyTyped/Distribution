package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaLite.specFacetMod.FacetMapping
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeaterMod {
  
  @JSImport("vega-lite/build/src/normalize/repeater", "replaceRepeaterInEncoding")
  @js.native
  def replaceRepeaterInEncoding[E /* <: Encoding[Field] */](encoding: E, repeater: RepeaterValue): Encoding[FieldName] = js.native
  
  @JSImport("vega-lite/build/src/normalize/repeater", "replaceRepeaterInFacet")
  @js.native
  def replaceRepeaterInFacet(facet: FacetFieldDef[Field, ExprRef | SignalRef], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = js.native
  @JSImport("vega-lite/build/src/normalize/repeater", "replaceRepeaterInFacet")
  @js.native
  def replaceRepeaterInFacet(facet: FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = js.native
  
  @js.native
  trait RepeaterValue extends StObject {
    
    var column: js.UndefOr[String] = js.native
    
    var layer: js.UndefOr[String] = js.native
    
    var repeat: js.UndefOr[String] = js.native
    
    var row: js.UndefOr[String] = js.native
  }
  object RepeaterValue {
    
    @scala.inline
    def apply(): RepeaterValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeaterValue]
    }
    
    @scala.inline
    implicit class RepeaterValueMutableBuilder[Self <: RepeaterValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      @scala.inline
      def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
