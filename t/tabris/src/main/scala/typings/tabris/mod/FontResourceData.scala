package typings.tabris.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<tabris.tabris.FontValue>> */
trait FontResourceData[Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof Resources ]: tabris.tabris.Font}
  */ typings.tabris.tabrisStrings.FontResourceData & TopLevel[js.Any] */] extends StObject {
  
  var build: Selectable[FontValue]
  
  var constructor: Selectable[FontValue]
}
object FontResourceData {
  
  @scala.inline
  def apply[Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Resources ]: tabris.tabris.Font}
    */ typings.tabris.tabrisStrings.FontResourceData & TopLevel[js.Any] */](): FontResourceData[Resources] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontResourceData[Resources]]
  }
  
  @scala.inline
  implicit class FontResourceDataMutableBuilder[Self <: FontResourceData[?], Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Resources ]: tabris.tabris.Font}
    */ typings.tabris.tabrisStrings.FontResourceData & TopLevel[js.Any] */] (val x: Self & FontResourceData[Resources]) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Selectable[FontValue]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNull: Self = StObject.set(x, "build", null)
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setConstructor(value: Selectable[FontValue]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructorNull: Self = StObject.set(x, "constructor", null)
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
