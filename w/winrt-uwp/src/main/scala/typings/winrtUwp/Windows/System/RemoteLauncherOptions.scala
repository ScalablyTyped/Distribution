package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options used to launch the default app for URI on a remote device. */
trait RemoteLauncherOptions extends StObject {
  
  /** Specifies the URI of the web site to view if the app to handle the URI can't be launched on the remote device. */
  var FallbackUri: Uri
  
  /** A list of package family names that should be used to launch the URI on the remote device. The first one in the list should be the preferred application to launch on the remote system (device). */
  var PreferredAppIds: IIterable[String]
}
object RemoteLauncherOptions {
  
  @scala.inline
  def apply(FallbackUri: Uri, PreferredAppIds: IIterable[String]): RemoteLauncherOptions = {
    val __obj = js.Dynamic.literal(FallbackUri = FallbackUri.asInstanceOf[js.Any], PreferredAppIds = PreferredAppIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteLauncherOptions]
  }
  
  @scala.inline
  implicit class RemoteLauncherOptionsMutableBuilder[Self <: RemoteLauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackUri(value: Uri): Self = StObject.set(x, "FallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAppIds(value: IIterable[String]): Self = StObject.set(x, "PreferredAppIds", value.asInstanceOf[js.Any])
  }
}
