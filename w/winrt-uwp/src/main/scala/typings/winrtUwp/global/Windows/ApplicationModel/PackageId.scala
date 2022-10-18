package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.PackageVersion
import typings.winrtUwp.Windows.System.ProcessorArchitecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides package identification info, such as name, version, and publisher. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.PackageId")
@js.native
open class PackageId ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.PackageId {
  
  /** Gets the processor architecture for which the package was created. */
  /* CompleteClass */
  var architecture: ProcessorArchitecture = js.native
  
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  /* CompleteClass */
  var author: String = js.native
  
  /** Gets the family name of the package. */
  /* CompleteClass */
  var familyName: String = js.native
  
  /** Gets the full name of the package. */
  /* CompleteClass */
  var fullName: String = js.native
  
  /** Gets the name of the package. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  /* CompleteClass */
  var productId: String = js.native
  
  /** Gets the publisher of the package. */
  /* CompleteClass */
  var publisher: String = js.native
  
  /** Gets the publisher ID of the package. */
  /* CompleteClass */
  var publisherId: String = js.native
  
  /** Gets the resource ID of the package. */
  /* CompleteClass */
  var resourceId: String = js.native
  
  /** Gets the package version info. */
  /* CompleteClass */
  var version: PackageVersion = js.native
}
