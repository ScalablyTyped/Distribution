package typings.tabris.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<string>> */
trait TextResourceData[Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof Resources ]: string}
  */ typings.tabris.tabrisStrings.TextResourceData & TopLevel[js.Any] */] extends StObject {
  
  var build: Selectable[String]
  
  var constructor: Selectable[String]
}
object TextResourceData {
  
  @scala.inline
  def apply[Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Resources ]: string}
    */ typings.tabris.tabrisStrings.TextResourceData & TopLevel[js.Any] */](): TextResourceData[Resources] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextResourceData[Resources]]
  }
  
  @scala.inline
  implicit class TextResourceDataMutableBuilder[Self <: TextResourceData[?], Resources /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Resources ]: string}
    */ typings.tabris.tabrisStrings.TextResourceData & TopLevel[js.Any] */] (val x: Self & TextResourceData[Resources]) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Selectable[String]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setConstructor(value: Selectable[String]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
