package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'mb' | 'marginBottom'> */
@js.native
trait MarginBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  
  var mb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}
object MarginBottomProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[ThemeType]]
  }
  
  @scala.inline
  implicit class MarginBottomPropsMutableBuilder[Self <: MarginBottomProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with MarginBottomProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setMarginBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
    
    @scala.inline
    def setMb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMbNull: Self = StObject.set(x, "mb", null)
    
    @scala.inline
    def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    @scala.inline
    def setMbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
  }
}
