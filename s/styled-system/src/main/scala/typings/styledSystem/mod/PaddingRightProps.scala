package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pr' | 'paddingRight'> */
trait PaddingRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var pr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
}
object PaddingRightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
  
  extension [Self <: PaddingRightProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & PaddingRightProps[ThemeType]) {
    
    inline def setPaddingRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
    
    inline def setPr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrNull: Self = StObject.set(x, "pr", null)
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setPrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
  }
}
