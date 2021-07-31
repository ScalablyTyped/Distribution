package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactQuerySearchScope extends StObject
/** Defines whether to search the local ContactStore or a server. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchScope")
@js.native
object ContactQuerySearchScope extends StObject {
  
  /** Local */
  @js.native
  sealed trait local
    extends StObject
       with ContactQuerySearchScope
  
  /** Server */
  @js.native
  sealed trait server
    extends StObject
       with ContactQuerySearchScope
}
