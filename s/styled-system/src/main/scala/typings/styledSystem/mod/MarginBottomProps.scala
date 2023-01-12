package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mb' | 'marginBottom'> */
trait MarginBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var mb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
}
object MarginBottomProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[ThemeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginBottomProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & MarginBottomProps[ThemeType]) extends AnyVal {
    
    inline def setMarginBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value*))
    
    inline def setMb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMbNull: Self = StObject.set(x, "mb", null)
    
    inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    inline def setMbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value*))
  }
}
