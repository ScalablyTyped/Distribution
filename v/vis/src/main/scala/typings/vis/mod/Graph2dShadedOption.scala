package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dShadedOption extends StObject {
  
  var groupid: js.UndefOr[IdType] = js.undefined
  
  var orientation: js.UndefOr[TopBottomEnumType] = js.undefined
}
object Graph2dShadedOption {
  
  @scala.inline
  def apply(): Graph2dShadedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dShadedOption]
  }
  
  @scala.inline
  implicit class Graph2dShadedOptionMutableBuilder[Self <: Graph2dShadedOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupid(value: IdType): Self = StObject.set(x, "groupid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupidUndefined: Self = StObject.set(x, "groupid", js.undefined)
    
    @scala.inline
    def setOrientation(value: TopBottomEnumType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
