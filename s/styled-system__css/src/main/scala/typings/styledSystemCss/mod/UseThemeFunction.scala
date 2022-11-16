package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type UseThemeFunction = (theme : any): @styled-system/css.@styled-system/css.SystemStyleObject
}}}
to avoid circular code involving: 
- @styled-system/css.@styled-system/css.SystemStyleObject
- @styled-system/css.@styled-system/css.UseThemeFunction
*/
@js.native
trait UseThemeFunction
  extends StObject
     with _SystemStyleObject {
  
  def apply(theme: Any): SystemStyleObject = js.native
}
