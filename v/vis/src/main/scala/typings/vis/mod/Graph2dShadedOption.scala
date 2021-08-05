package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dShadedOption extends StObject {
  
  var groupid: js.UndefOr[IdType] = js.undefined
  
  var orientation: js.UndefOr[TopBottomEnumType] = js.undefined
}
object Graph2dShadedOption {
  
  inline def apply(): Graph2dShadedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dShadedOption]
  }
  
  extension [Self <: Graph2dShadedOption](x: Self) {
    
    inline def setGroupid(value: IdType): Self = StObject.set(x, "groupid", value.asInstanceOf[js.Any])
    
    inline def setGroupidUndefined: Self = StObject.set(x, "groupid", js.undefined)
    
    inline def setOrientation(value: TopBottomEnumType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
