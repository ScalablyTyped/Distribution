package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactAnnotationStoreAccessType extends StObject
/** Specifies if the app can read and write all annotations or only those belonging to the app itself. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType")
@js.native
object ContactAnnotationStoreAccessType extends StObject {
  
  /** All contact annotations. */
  @js.native
  sealed trait allAnnotationsReadWrite extends ContactAnnotationStoreAccessType
  
  /** Only local app contact annotations. */
  @js.native
  sealed trait appAnnotationsReadWrite extends ContactAnnotationStoreAccessType
}
