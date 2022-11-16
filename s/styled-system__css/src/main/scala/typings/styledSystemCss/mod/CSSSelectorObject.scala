package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type CSSSelectorObject = {[cssSelector: string] : @styled-system/css.@styled-system/css.SystemStyleObject}
}}}
to avoid circular code involving: 
- @styled-system/css.@styled-system/css.CSSSelectorObject
- @styled-system/css.@styled-system/css.SystemStyleObject
- @styled-system/css.@styled-system/css.UseThemeFunction
*/
trait CSSSelectorObject
  extends StObject
     with /* cssSelector */ StringDictionary[SystemStyleObject]
     with _SystemStyleObject
object CSSSelectorObject {
  
  inline def apply(): CSSSelectorObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSSelectorObject]
  }
}
