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
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
  
  @scala.inline
  implicit class PaddingRightPropsMutableBuilder[Self <: PaddingRightProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & PaddingRightProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setPaddingRight(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingRightVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
    
    @scala.inline
    def setPr(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrNull: Self = StObject.set(x, "pr", null)
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setPrVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
  }
}
