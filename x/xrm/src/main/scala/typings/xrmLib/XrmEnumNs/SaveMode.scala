package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SaveMode extends js.Object

/**
  * Enumeration of entity form save modes.
  */
@JSGlobal("XrmEnum.SaveMode")
@js.native
object SaveMode extends js.Object {
  @js.native
  sealed trait Assign
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait AutoSave
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Deactivate
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Disqualify
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Qualify
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Reactivate
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Save
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait SaveAndClose
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait SaveAndNew
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait SaveAsCompleted
    extends xrmLib.XrmEnumNs.SaveMode
  
  @js.native
  sealed trait Send
    extends xrmLib.XrmEnumNs.SaveMode
  
  /* 47 */ val Assign: Assign with scala.Double = js.native
  /* 70 */ val AutoSave: AutoSave with scala.Double = js.native
  /* 5 */ val Deactivate: Deactivate with scala.Double = js.native
  /* 15 */ val Disqualify: Disqualify with scala.Double = js.native
  /* 16 */ val Qualify: Qualify with scala.Double = js.native
  /* 6 */ val Reactivate: Reactivate with scala.Double = js.native
  /* 1 */ val Save: Save with scala.Double = js.native
  /* 2 */ val SaveAndClose: SaveAndClose with scala.Double = js.native
  /* 59 */ val SaveAndNew: SaveAndNew with scala.Double = js.native
  /* 58 */ val SaveAsCompleted: SaveAsCompleted with scala.Double = js.native
  /* 7 */ val Send: Send with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.SaveMode with scala.Double] = js.native
}

