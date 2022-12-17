package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pb' | 'paddingBottom'> */
trait PaddingBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var pb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
}
object PaddingBottomProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[ThemeType]]
  }
  
  extension [Self <: PaddingBottomProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & PaddingBottomProps[ThemeType]) {
    
    inline def setPaddingBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value*))
    
    inline def setPb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    inline def setPbNull: Self = StObject.set(x, "pb", null)
    
    inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    inline def setPbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value*))
  }
}
