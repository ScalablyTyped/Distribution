package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mb' | 'marginBottom'> */
trait MarginBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var mb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
}
object MarginBottomProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[ThemeType]]
  }
  
  extension [Self <: MarginBottomProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & MarginBottomProps[ThemeType]) {
    
    inline def setMarginBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
    
    inline def setMb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMbNull: Self = StObject.set(x, "mb", null)
    
    inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    inline def setMbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
  }
}
