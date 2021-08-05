package typings.tabris.anon

import typings.tabris.mod.LayoutDataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutData extends StObject {
  
  var layoutData: js.UndefOr[LayoutDataValue] = js.undefined
}
object LayoutData {
  
  inline def apply(): LayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutData]
  }
  
  extension [Self <: LayoutData](x: Self) {
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLayoutDataUndefined: Self = StObject.set(x, "layoutData", js.undefined)
  }
}
