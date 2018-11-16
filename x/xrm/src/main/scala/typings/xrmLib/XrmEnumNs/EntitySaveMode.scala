package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntitySaveMode extends js.Object

/**
     * Constant Enum: {@link Entity.save Entity} Save Modes
     * @see {@link Xrm.EntitySaveMode}
     * @see {@link Entity}
     * @see {@link Entity.save}
     */
@JSGlobal("XrmEnum.EntitySaveMode")
@js.native
object EntitySaveMode extends js.Object {
  @js.native
  sealed trait SaveAndClose
    extends xrmLib.XrmEnumNs.EntitySaveMode
  
  @js.native
  sealed trait SaveAndNew
    extends xrmLib.XrmEnumNs.EntitySaveMode
  
  /* "saveandclose" */ val SaveAndClose: SaveAndClose with java.lang.String = js.native
  /* "saveandnew" */ val SaveAndNew: SaveAndNew with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.EntitySaveMode with java.lang.String] = js.native
}

