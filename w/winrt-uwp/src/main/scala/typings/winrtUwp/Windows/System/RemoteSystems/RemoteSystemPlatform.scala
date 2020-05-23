package typings.winrtUwp.Windows.System.RemoteSystems

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
  
}

