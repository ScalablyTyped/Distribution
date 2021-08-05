package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mr' | 'marginRight'> */
trait MarginRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var mr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
}
object MarginRightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[ThemeType]]
  }
  
  extension [Self <: MarginRightProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & MarginRightProps[ThemeType]) {
    
    inline def setMarginRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
    
    inline def setMr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMrNull: Self = StObject.set(x, "mr", null)
    
    inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    inline def setMrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
  }
}
