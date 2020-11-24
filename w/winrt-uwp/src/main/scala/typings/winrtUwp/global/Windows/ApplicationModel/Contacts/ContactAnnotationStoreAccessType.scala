package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies if the app can read and write all annotations or only those belonging to the app itself. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType")
@js.native
object ContactAnnotationStoreAccessType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType with Double
  ] = js.native
  
  /* 1 */ val allAnnotationsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType.allAnnotationsReadWrite with Double = js.native
  
  /* 0 */ val appAnnotationsReadWrite: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType.appAnnotationsReadWrite with Double = js.native
}
