package typings.vegaLite

import typings.vegaLite.anon.Signal
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerComponentMod {
  
  @JSImport("vega-lite/build/src/compile/header/component", "HEADER_CHANNELS")
  @js.native
  val HEADER_CHANNELS: js.Array[HeaderChannel] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/component", "HEADER_TYPES")
  @js.native
  val HEADER_TYPES: js.Array[HeaderType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.row
    - typings.vegaLite.vegaLiteStrings.column
  */
  trait HeaderChannel extends StObject
  object HeaderChannel {
    
    inline def column: typings.vegaLite.vegaLiteStrings.column = "column".asInstanceOf[typings.vegaLite.vegaLiteStrings.column]
    
    inline def row: typings.vegaLite.vegaLiteStrings.row = "row".asInstanceOf[typings.vegaLite.vegaLiteStrings.row]
  }
  
  trait HeaderComponent extends StObject {
    
    var axes: js.Array[Axis]
    
    var labels: Boolean
    
    var sizeSignal: Signal
  }
  object HeaderComponent {
    
    inline def apply(axes: js.Array[Axis], labels: Boolean, sizeSignal: Signal): HeaderComponent = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], sizeSignal = sizeSignal.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderComponent]
    }
    
    extension [Self <: HeaderComponent](x: Self) {
      
      inline def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setSizeSignal(value: Signal): Self = StObject.set(x, "sizeSignal", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.header
    - typings.vegaLite.vegaLiteStrings.footer
  */
  trait HeaderType extends StObject
  object HeaderType {
    
    inline def footer: typings.vegaLite.vegaLiteStrings.footer = "footer".asInstanceOf[typings.vegaLite.vegaLiteStrings.footer]
    
    inline def header: typings.vegaLite.vegaLiteStrings.header = "header".asInstanceOf[typings.vegaLite.vegaLiteStrings.header]
  }
  
  trait LayoutHeaderComponent extends StObject {
    
    var facetFieldDef: js.UndefOr[FacetFieldDef[String, SignalRef]] = js.undefined
    
    /**
      * An array of header components for footers.
      * For facet, there should be only one header component, which is data-driven.
      * For concat, there can be multiple header components that explicitly list different axes.
      */
    var footer: js.UndefOr[js.Array[HeaderComponent]] = js.undefined
    
    /**
      * An array of header components for headers.
      * For facet, there should be only one header component, which is data-driven.
      * For concat, there can be multiple header components that explicitly list different axes.
      */
    var header: js.UndefOr[js.Array[HeaderComponent]] = js.undefined
    
    var title: js.UndefOr[Text | SignalRef] = js.undefined
  }
  object LayoutHeaderComponent {
    
    inline def apply(): LayoutHeaderComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutHeaderComponent]
    }
    
    extension [Self <: LayoutHeaderComponent](x: Self) {
      
      inline def setFacetFieldDef(value: FacetFieldDef[String, SignalRef]): Self = StObject.set(x, "facetFieldDef", value.asInstanceOf[js.Any])
      
      inline def setFacetFieldDefUndefined: Self = StObject.set(x, "facetFieldDef", js.undefined)
      
      inline def setFooter(value: js.Array[HeaderComponent]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: HeaderComponent*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      inline def setHeader(value: js.Array[HeaderComponent]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: HeaderComponent*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    }
  }
  
  trait LayoutHeaderComponentIndex extends StObject {
    
    var column: js.UndefOr[LayoutHeaderComponent] = js.undefined
    
    var facet: js.UndefOr[LayoutHeaderComponent] = js.undefined
    
    var row: js.UndefOr[LayoutHeaderComponent] = js.undefined
  }
  object LayoutHeaderComponentIndex {
    
    inline def apply(): LayoutHeaderComponentIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutHeaderComponentIndex]
    }
    
    extension [Self <: LayoutHeaderComponentIndex](x: Self) {
      
      inline def setColumn(value: LayoutHeaderComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFacet(value: LayoutHeaderComponent): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      inline def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
      
      inline def setRow(value: LayoutHeaderComponent): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
