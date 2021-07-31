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
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[ThemeType]]
  }
  
  @scala.inline
  implicit class MarginRightPropsMutableBuilder[Self <: MarginRightProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & MarginRightProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setMarginRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
    
    @scala.inline
    def setMr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMrNull: Self = StObject.set(x, "mr", null)
    
    @scala.inline
    def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    @scala.inline
    def setMrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
  }
}
