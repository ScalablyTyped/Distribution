package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an application such as it name, logo, package information, ID. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppInfo")
@js.native
open class AppInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.AppInfo {
  
  /** An identifier that uniquely identifies the app. */
  /* CompleteClass */
  var appUserModelId: String = js.native
  
  /** Gets information that describes the application. */
  /* CompleteClass */
  var displayInfo: typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo = js.native
  
  /** Gets the app identifier. */
  /* CompleteClass */
  var id: String = js.native
  
  /** An identifier that uniquely identifies the app's package. */
  /* CompleteClass */
  var packageFamilyName: String = js.native
}
