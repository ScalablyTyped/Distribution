package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an application's name, description, and logo. */
@JSGlobal("Windows.ApplicationModel.AppDisplayInfo")
@js.native
abstract class AppDisplayInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo {
  
  /** Gets the application's description. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets the application's display name. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /**
    * Get the application's logo.
    * @param size The size of the rectangle in which the logo must fit.
    * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
    */
  /* CompleteClass */
  override def getLogo(size: Size): RandomAccessStreamReference = js.native
}
