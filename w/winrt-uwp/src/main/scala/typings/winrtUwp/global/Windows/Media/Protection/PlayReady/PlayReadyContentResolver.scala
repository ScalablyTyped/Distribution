package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Receives multiple service request objects that are necessary to enable the playback ability for a given content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver")
@js.native
abstract class PlayReadyContentResolver ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentResolver
object PlayReadyContentResolver {
  
  /**
    * Proactively initiates the service request chain for a given content header.
    * @param contentHeader Content header for the content the app wants to resolve all necessary service request operations.
    * @return The first service request operation required to resolve the content.
    */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver.serviceRequest")
  @js.native
  def serviceRequest(contentHeader: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader): IPlayReadyServiceRequest = js.native
}
