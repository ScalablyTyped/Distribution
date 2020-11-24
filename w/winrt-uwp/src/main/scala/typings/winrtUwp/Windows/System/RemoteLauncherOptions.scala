package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options used to launch the default app for URI on a remote device. */
@js.native
trait RemoteLauncherOptions extends js.Object {
  
  /** Specifies the URI of the web site to view if the app to handle the URI can't be launched on the remote device. */
  var FallbackUri: Uri = js.native
  
  /** A list of package family names that should be used to launch the URI on the remote device. The first one in the list should be the preferred application to launch on the remote system (device). */
  var PreferredAppIds: IIterable[String] = js.native
}
object RemoteLauncherOptions {
  
  @scala.inline
  def apply(FallbackUri: Uri, PreferredAppIds: IIterable[String]): RemoteLauncherOptions = {
    val __obj = js.Dynamic.literal(FallbackUri = FallbackUri.asInstanceOf[js.Any], PreferredAppIds = PreferredAppIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteLauncherOptions]
  }
  
  @scala.inline
  implicit class RemoteLauncherOptionsOps[Self <: RemoteLauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackUri(value: Uri): Self = this.set("FallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAppIds(value: IIterable[String]): Self = this.set("PreferredAppIds", value.asInstanceOf[js.Any])
  }
}
