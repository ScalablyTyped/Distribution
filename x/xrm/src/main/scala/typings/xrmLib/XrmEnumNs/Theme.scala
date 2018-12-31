package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Theme extends js.Object

/**
  * Constant Enum: Themes for {@link GlobalContext.getCurrentTheme globalContext.getCurrentTheme()}.
  * @remarks getCurrentTheme() does not work with Dynamics CRM for tablets or in the unified interface.
  */
@JSGlobal("XrmEnum.Theme")
@js.native
object Theme extends js.Object {
  @js.native
  sealed trait Default
    extends xrmLib.XrmEnumNs.Theme
  
  @js.native
  sealed trait Office12Blue
    extends xrmLib.XrmEnumNs.Theme
  
  @js.native
  sealed trait Office14Silver
    extends xrmLib.XrmEnumNs.Theme
  
  /* "default" */ val Default: Default with java.lang.String = js.native
  /* "Office12Blue" */ val Office12Blue: Office12Blue with java.lang.String = js.native
  /* "Office14Silver" */ val Office14Silver: Office14Silver with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.Theme with java.lang.String] = js.native
}

