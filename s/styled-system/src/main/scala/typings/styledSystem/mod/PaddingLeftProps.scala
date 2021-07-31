package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pl' | 'paddingLeft'> */
trait PaddingLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
  
  var pl: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
      ThemeType
    ]
  ] = js.undefined
}
object PaddingLeftProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[ThemeType]]
  }
  
  @scala.inline
  implicit class PaddingLeftPropsMutableBuilder[Self <: PaddingLeftProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & PaddingLeftProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setPaddingLeft(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingLeftVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def setPl(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlNull: Self = StObject.set(x, "pl", null)
    
    @scala.inline
    def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    @scala.inline
    def setPlVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
  }
}
