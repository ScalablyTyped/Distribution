package typings.tabris.anon

import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spacing extends StObject {
  
  var alignment: js.UndefOr[left | centerX | stretchX | right] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object Spacing {
  
  inline def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  
  extension [Self <: Spacing](x: Self) {
    
    inline def setAlignment(value: left | centerX | stretchX | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
