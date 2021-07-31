package typings.tabris.anon

import typings.tabris.mod.LayoutDataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutData extends StObject {
  
  var layoutData: js.UndefOr[LayoutDataValue] = js.undefined
}
object LayoutData {
  
  @scala.inline
  def apply(): LayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutData]
  }
  
  @scala.inline
  implicit class LayoutDataMutableBuilder[Self <: LayoutData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutDataUndefined: Self = StObject.set(x, "layoutData", js.undefined)
  }
}
