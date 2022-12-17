package typings.styledSystem.mod

import typings.csstype.mod.Property.BackgroundRepeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundRepeatProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The background-repeat CSS property sets how background images are repeated. A background
    * image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat)
    */
  var backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeat, ThemeType]] = js.undefined
}
object BackgroundRepeatProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BackgroundRepeatProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps[ThemeType]]
  }
  
  extension [Self <: BackgroundRepeatProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & BackgroundRepeatProps[ThemeType]) {
    
    inline def setBackgroundRepeat(value: ResponsiveValue[BackgroundRepeat, ThemeType]): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatNull: Self = StObject.set(x, "backgroundRepeat", null)
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundRepeatVarargs(value: (BackgroundRepeat | Null)*): Self = StObject.set(x, "backgroundRepeat", js.Array(value*))
  }
}
