package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'ml' | 'marginLeft'> */
trait MarginLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var ml: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
}
object MarginLeftProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[ThemeType]]
  }
  
  extension [Self <: MarginLeftProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & MarginLeftProps[ThemeType]) {
    
    inline def setMarginLeft(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginLeftVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value*))
    
    inline def setMl(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMlNull: Self = StObject.set(x, "ml", null)
    
    inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    inline def setMlVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value*))
  }
}
