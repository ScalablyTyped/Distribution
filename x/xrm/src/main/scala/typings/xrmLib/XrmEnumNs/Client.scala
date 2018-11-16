package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Client extends js.Object

/**
     * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
     * @see {@link Xrm.Client}
     */
@JSGlobal("XrmEnum.Client")
@js.native
object Client extends js.Object {
  @js.native
  sealed trait Mobile
    extends xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait Outlook
    extends xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait USD
    extends xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait Web
    extends xrmLib.XrmEnumNs.Client
  
  /* "Mobile" */ val Mobile: Mobile with java.lang.String = js.native
  /* "Outlook" */ val Outlook: Outlook with java.lang.String = js.native
  /* "UnifiedServiceDesk" */ val USD: USD with java.lang.String = js.native
  /* "UnifiedServiceDesk" */ val UnifiedServiceDesk: UnifiedServiceDesk with java.lang.String = js.native
  /* "Web" */ val Web: Web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.Client with java.lang.String] = js.native
}

