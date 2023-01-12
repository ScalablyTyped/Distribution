package typings.tabris.anon

import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  var alignment: js.UndefOr[top | centerY | stretchY | bottom | baseline] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object Alignment {
  
  inline def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alignment] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: top | centerY | stretchY | bottom | baseline): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
