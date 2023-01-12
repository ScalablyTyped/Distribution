package typings.styledSystem.mod

import typings.csstype.mod.Property.JustifySelf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifySelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[ResponsiveValue[JustifySelf, ThemeType]] = js.undefined
}
object JustifySelfProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifySelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JustifySelfProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & JustifySelfProps[ThemeType]) extends AnyVal {
    
    inline def setJustifySelf(value: ResponsiveValue[JustifySelf, ThemeType]): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    inline def setJustifySelfNull: Self = StObject.set(x, "justifySelf", null)
    
    inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    inline def setJustifySelfVarargs(value: (JustifySelf | Null)*): Self = StObject.set(x, "justifySelf", js.Array(value*))
  }
}
