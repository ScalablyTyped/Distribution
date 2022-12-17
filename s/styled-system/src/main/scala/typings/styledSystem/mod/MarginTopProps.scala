package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mt' | 'marginTop'> */
trait MarginTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var mt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
      ThemeType
    ]
  ] = js.undefined
}
object MarginTopProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginTopProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginTopProps[ThemeType]]
  }
  
  extension [Self <: MarginTopProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & MarginTopProps[ThemeType]) {
    
    inline def setMarginTop(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginTopVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value*))
    
    inline def setMt(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtNull: Self = StObject.set(x, "mt", null)
    
    inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    inline def setMtVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value*))
  }
}
