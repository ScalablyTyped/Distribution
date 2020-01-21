package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Starts the default app associated with the specified URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
abstract class RemoteLauncher () extends js.Object

/* static members */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
object RemoteLauncher extends js.Object {
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[RemoteLaunchUriStatus] = js.native
}

