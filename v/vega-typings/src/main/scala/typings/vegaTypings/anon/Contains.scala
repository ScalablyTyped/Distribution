package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaTypings.typesSpecAutosizeMod.AutoSizeType
import typings.vegaTypings.vegaTypingsStrings.content
import typings.vegaTypings.vegaTypingsStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains
  extends StObject
     with AutoSize {
  
  var contains: js.UndefOr[content | padding] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var `type`: AutoSizeType
}
object Contains {
  
  inline def apply(`type`: AutoSizeType): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  extension [Self <: Contains](x: Self) {
    
    inline def setContains(value: content | padding): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setType(value: AutoSizeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
