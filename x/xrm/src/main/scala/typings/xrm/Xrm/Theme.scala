package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Themes for {@link GlobalContext.getCurrentTheme globalContext.getCurrentTheme()}.
  * @remarks getCurrentTheme() does not work with Dynamics CRM for tablets or in the unified interface.
  * @see {@link XrmEnum.Theme}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.default
  - typings.xrm.xrmStrings.Office12Blue
  - typings.xrm.xrmStrings.Office14Silver
*/
trait Theme extends js.Object
object Theme {
  
  @scala.inline
  def Office12Blue: typings.xrm.xrmStrings.Office12Blue = "Office12Blue".asInstanceOf[typings.xrm.xrmStrings.Office12Blue]
  
  @scala.inline
  def Office14Silver: typings.xrm.xrmStrings.Office14Silver = "Office14Silver".asInstanceOf[typings.xrm.xrmStrings.Office14Silver]
  
  @scala.inline
  def default: typings.xrm.xrmStrings.default = "default".asInstanceOf[typings.xrm.xrmStrings.default]
}
