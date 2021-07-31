package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the level of contact write access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess")
@js.native
object ContactListOtherAppWriteAccess extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess & Double
  ] = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess.none & Double = js.native
  
  /* 1 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess.systemOnly & Double = js.native
}
