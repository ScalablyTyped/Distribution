package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactFieldType extends StObject
/** Defines the type of contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends StObject {
  
  /** The contact's address. Supported on Windows Phone. */
  @js.native
  sealed trait address
    extends StObject
       with ContactFieldType
  
  /** The contact's connected service account. */
  @js.native
  sealed trait connectedServiceAccount
    extends StObject
       with ContactFieldType
  
  /** Custom may be altered or unavailable for releases after Windows 8.1. Instead, use one of the specific types. */
  @js.native
  sealed trait custom
    extends StObject
       with ContactFieldType
  
  /** The contact's email address. Supported on Windows Phone. */
  @js.native
  sealed trait email
    extends StObject
       with ContactFieldType
  
  /** The contact's important dates. */
  @js.native
  sealed trait importantDate
    extends StObject
       with ContactFieldType
  
  /** InstantMessage may be altered or unavailable for releases after Windows 8.1. Instead, use ConnectedServiceAccount. */
  @js.native
  sealed trait instantMessage
    extends StObject
       with ContactFieldType
  
  /** The contact's job info. */
  @js.native
  sealed trait jobInfo
    extends StObject
       with ContactFieldType
  
  /** Location may be altered or unavailable for releases after Windows 8.1. Instead, use Address. */
  @js.native
  sealed trait location
    extends StObject
       with ContactFieldType
  
  /** The contact's notes. */
  @js.native
  sealed trait notes
    extends StObject
       with ContactFieldType
  
  /** The contact's phone number. Supported on Windows Phone. */
  @js.native
  sealed trait phoneNumber
    extends StObject
       with ContactFieldType
  
  /** The contact's significant other. */
  @js.native
  sealed trait significantOther
    extends StObject
       with ContactFieldType
  
  /** The contact's Web site. */
  @js.native
  sealed trait website
    extends StObject
       with ContactFieldType
}
