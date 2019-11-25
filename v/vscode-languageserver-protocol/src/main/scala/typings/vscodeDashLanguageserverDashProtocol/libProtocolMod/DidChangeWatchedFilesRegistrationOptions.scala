package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeWatchedFilesRegistrationOptions extends js.Object {
  /**
    * The watchers to register.
    */
  var watchers: js.Array[FileSystemWatcher]
}

object DidChangeWatchedFilesRegistrationOptions {
  @scala.inline
  def apply(watchers: js.Array[FileSystemWatcher]): DidChangeWatchedFilesRegistrationOptions = {
    val __obj = js.Dynamic.literal(watchers = watchers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidChangeWatchedFilesRegistrationOptions]
  }
}

