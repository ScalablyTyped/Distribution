package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemPlatform extends js.Object

/** Contains values that describe the operating system platforms that a remote system could be running. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemPlatform")
@js.native
object RemoteSystemPlatform extends js.Object {
  /** The device is running Android. */
  @js.native
  sealed trait android extends RemoteSystemPlatform
  
  /** The device is running iOS. */
  @js.native
  sealed trait ios extends RemoteSystemPlatform
  
  /** The device is running Linux. */
  @js.native
  sealed trait linux extends RemoteSystemPlatform
  
  /** The OS platform is unknown. */
  @js.native
  sealed trait unknown extends RemoteSystemPlatform
  
  /** The device is running Windows. */
  @js.native
  sealed trait windows extends RemoteSystemPlatform
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemPlatform with Double] = js.native
  /* 2 */ @js.native
  object android extends TopLevel[android with Double]
  
  /* 3 */ @js.native
  object ios extends TopLevel[ios with Double]
  
  /* 4 */ @js.native
  object linux extends TopLevel[linux with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object windows extends TopLevel[windows with Double]
  
}

