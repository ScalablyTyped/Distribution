package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldCategory extends js.Object

/** Defines the categories that contact data can belong to. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends js.Object {
  /** The Home category. */
  @js.native
  sealed trait home extends ContactFieldCategory
  
  /** The Mobile category. */
  @js.native
  sealed trait mobile extends ContactFieldCategory
  
  /** The data doesn't belong to a category */
  @js.native
  sealed trait none extends ContactFieldCategory
  
  /** The Other category. */
  @js.native
  sealed trait other extends ContactFieldCategory
  
  /** The Work category. */
  @js.native
  sealed trait work extends ContactFieldCategory
  
}

