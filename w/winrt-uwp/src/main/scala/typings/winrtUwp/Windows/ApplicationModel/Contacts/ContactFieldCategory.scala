package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactFieldCategory extends StObject
/** Defines the categories that contact data can belong to. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends StObject {
  
  /** The Home category. */
  @js.native
  sealed trait home
    extends StObject
       with ContactFieldCategory
  
  /** The Mobile category. */
  @js.native
  sealed trait mobile
    extends StObject
       with ContactFieldCategory
  
  /** The data doesn't belong to a category */
  @js.native
  sealed trait none
    extends StObject
       with ContactFieldCategory
  
  /** The Other category. */
  @js.native
  sealed trait other
    extends StObject
       with ContactFieldCategory
  
  /** The Work category. */
  @js.native
  sealed trait work
    extends StObject
       with ContactFieldCategory
}
