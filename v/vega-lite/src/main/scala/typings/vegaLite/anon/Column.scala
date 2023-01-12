package typings.vegaLite.anon

import typings.vegaLite.buildSrcCompileHeaderComponentMod.LayoutHeaderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: js.UndefOr[LayoutHeaderComponent] = js.undefined
  
  var facet: js.UndefOr[LayoutHeaderComponent] = js.undefined
  
  var row: js.UndefOr[LayoutHeaderComponent] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: LayoutHeaderComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setFacet(value: LayoutHeaderComponent): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    inline def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
    
    inline def setRow(value: LayoutHeaderComponent): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
