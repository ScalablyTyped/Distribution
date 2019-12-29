package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldCategory with Double] = js.native
  /* 1 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 3 */ @js.native
  object mobile extends TopLevel[mobile with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 2 */ @js.native
  object work extends TopLevel[work with Double]
  
}

