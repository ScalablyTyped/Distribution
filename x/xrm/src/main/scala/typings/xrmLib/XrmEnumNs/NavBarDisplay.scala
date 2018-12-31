package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavBarDisplay extends js.Object

/**
  * Constant Enum: Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
  * @see {@link Xrm.Url.NavBarDisplay}
  */
@JSGlobal("XrmEnum.NavBarDisplay")
@js.native
object NavBarDisplay extends js.Object {
  @js.native
  sealed trait Entity
    extends xrmLib.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait Off
    extends xrmLib.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait On
    extends xrmLib.XrmEnumNs.NavBarDisplay
  
  /* "entity" */ val Entity: Entity with java.lang.String = js.native
  /* "off" */ val Off: Off with java.lang.String = js.native
  /* "on" */ val On: On with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.NavBarDisplay with java.lang.String] = js.native
}

