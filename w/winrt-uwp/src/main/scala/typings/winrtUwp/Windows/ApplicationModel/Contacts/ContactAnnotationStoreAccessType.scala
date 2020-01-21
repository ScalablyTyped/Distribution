package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAnnotationStoreAccessType with Double] = js.native
  /* 1 */ @js.native
  object allAnnotationsReadWrite extends TopLevel[allAnnotationsReadWrite with Double]
  
  /* 0 */ @js.native
  object appAnnotationsReadWrite extends TopLevel[appAnnotationsReadWrite with Double]
  
}

