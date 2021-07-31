package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the default app associated with the specified URI on a remote device. */
@JSGlobal("Windows.System.RemoteLauncher")
@js.native
abstract class RemoteLauncher ()
  extends StObject
     with typings.winrtUwp.Windows.System.RemoteLauncher
object RemoteLauncher {
  
  @JSGlobal("Windows.System.RemoteLauncher")
  @js.native
  val ^ : js.Any = js.native
  
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device. */
  /* static member */
  @scala.inline
  def launchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest, uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options. */
  /* static member */
  @scala.inline
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typings.winrtUwp.Windows.System.RemoteLauncherOptions
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
  /** Starts the default app associated with the URI scheme name for the specified URI on a remote device, using the specified options and input data. */
  /* static member */
  @scala.inline
  def launchUriAsync(
    remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
    uri: Uri,
    options: typings.winrtUwp.Windows.System.RemoteLauncherOptions,
    inputData: ValueSet
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(remoteSystemConnectionRequest.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteLaunchUriStatus]]
}
