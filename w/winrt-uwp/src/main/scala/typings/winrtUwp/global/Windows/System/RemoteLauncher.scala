package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the default app associated with the specified URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
abstract class RemoteLauncher ()
  extends typings.winrtUwp.Windows.System.RemoteLauncher
/* static members */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
object RemoteLauncher extends js.Object {
  
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typings.winrtUwp.Windows.System.RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typings.winrtUwp.Windows.System.RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = js.native
}
