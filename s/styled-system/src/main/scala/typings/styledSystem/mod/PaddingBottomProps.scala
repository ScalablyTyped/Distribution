package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pb' | 'paddingBottom'> */
@js.native
trait PaddingBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  
  var pb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}
object PaddingBottomProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[ThemeType]]
  }
  
  @scala.inline
  implicit class PaddingBottomPropsMutableBuilder[Self <: PaddingBottomProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with PaddingBottomProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setPaddingBottom(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingBottomVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def setPb(
      value: ResponsiveValue[
          ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbNull: Self = StObject.set(x, "pb", null)
    
    @scala.inline
    def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    @scala.inline
    def setPbVarargs(value: ((ThemeValue[typings.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
  }
}
