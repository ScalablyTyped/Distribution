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
  
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: `true`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setStretch(value: `true`): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setStretchX(value: `true`): Self = StObject.set(x, "stretchX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchXUndefined: Self = StObject.set(x, "stretchX", js.undefined)
    
    @scala.inline
    def setStretchY(value: `true`): Self = StObject.set(x, "stretchY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchYUndefined: Self = StObject.set(x, "stretchY", js.undefined)
  }
}
