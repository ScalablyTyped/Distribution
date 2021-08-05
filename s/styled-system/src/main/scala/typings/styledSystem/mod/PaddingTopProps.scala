package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pt' | 'paddingTop'> */
trait PaddingTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var pt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
}
object PaddingTopProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingTopProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[ThemeType]]
  }
  
  extension [Self <: PaddingTopProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & PaddingTopProps[ThemeType]) {
    
    inline def setPaddingTop(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingTopVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
    
    inline def setPt(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtNull: Self = StObject.set(x, "pt", null)
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    inline def setPtVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
  }
}
