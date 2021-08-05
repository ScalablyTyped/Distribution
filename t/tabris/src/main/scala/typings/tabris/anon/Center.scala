package typings.tabris.anon

import typings.tabris.tabrisBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: js.UndefOr[`true`] = js.undefined
  
  var stretch: js.UndefOr[`true`] = js.undefined
  
  var stretchX: js.UndefOr[`true`] = js.undefined
  
  var stretchY: js.UndefOr[`true`] = js.undefined
}
object Center {
  
  inline def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: `true`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setStretch(value: `true`): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setStretchX(value: `true`): Self = StObject.set(x, "stretchX", value.asInstanceOf[js.Any])
    
    inline def setStretchXUndefined: Self = StObject.set(x, "stretchX", js.undefined)
    
    inline def setStretchY(value: `true`): Self = StObject.set(x, "stretchY", value.asInstanceOf[js.Any])
    
    inline def setStretchYUndefined: Self = StObject.set(x, "stretchY", js.undefined)
  }
}
