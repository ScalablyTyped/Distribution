package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostMessageMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "HostMessageMode")
@js.native
object HostMessageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostMessageMode with Double] = js.native
  
  /** display message in chatlog */
  @js.native
  sealed trait LOG extends HostMessageMode
  /* 1 */ val LOG: typings.ts3NodejsLibrary.enumMod.HostMessageMode.LOG with Double = js.native
  
  /** display message in modal dialog */
  @js.native
  sealed trait MODAL extends HostMessageMode
  /* 2 */ val MODAL: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODAL with Double = js.native
  
  /** display message in modal dialog and close connection */
  @js.native
  sealed trait MODALQUIT extends HostMessageMode
  /* 3 */ val MODALQUIT: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODALQUIT with Double = js.native
  
  /** don't display anything */
  @js.native
  sealed trait NONE extends HostMessageMode
  /* 0 */ val NONE: typings.ts3NodejsLibrary.enumMod.HostMessageMode.NONE with Double = js.native
}
