package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostMessageMode extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "HostMessageMode")
@js.native
object HostMessageMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostMessageMode with Double] = js.native
  
  /** display message in chatlog */
  @js.native
  sealed trait LOG extends HostMessageMode
  /* 1 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  /** display message in modal dialog */
  @js.native
  sealed trait MODAL extends HostMessageMode
  /* 2 */ @js.native
  object MODAL extends TopLevel[MODAL with Double]
  
  /** display message in modal dialog and close connection */
  @js.native
  sealed trait MODALQUIT extends HostMessageMode
  /* 3 */ @js.native
  object MODALQUIT extends TopLevel[MODALQUIT with Double]
  
  /** don't display anything */
  @js.native
  sealed trait NONE extends HostMessageMode
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
}
