package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAnnotationStoreAccessType extends js.Object

/** Specifies if the app can read and write all annotations or only those belonging to the app itself. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType")
@js.native
object ContactAnnotationStoreAccessType extends js.Object {
  /** All contact annotations. */
  @js.native
  sealed trait allAnnotationsReadWrite extends ContactAnnotationStoreAccessType
  
  /** Only local app contact annotations. */
  @js.native
  sealed trait appAnnotationsReadWrite extends ContactAnnotationStoreAccessType
  
  /* 1 */ val allAnnotationsReadWrite: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType.allAnnotationsReadWrite with Double = js.native
  /* 0 */ val appAnnotationsReadWrite: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType.appAnnotationsReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAnnotationStoreAccessType with Double] = js.native
}

