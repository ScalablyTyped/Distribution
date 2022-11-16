package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type CssFunctionReturnType = (props : @styled-system/css.@styled-system/css.Theme | {  theme :@styled-system/css.@styled-system/css.Theme} | undefined): @styled-system/css.@styled-system/css.CSSObject
}}}
to avoid circular code involving: 
- @styled-system/css.@styled-system/css.CssFunctionReturnType
- @styled-system/css.@styled-system/css.Theme
*/
@js.native
trait CssFunctionReturnType extends StObject {
  
  def apply(): CSSObject = js.native
  def apply(props: typings.styledSystemCss.anon.Theme): CSSObject = js.native
  def apply(props: Theme): CSSObject = js.native
}
