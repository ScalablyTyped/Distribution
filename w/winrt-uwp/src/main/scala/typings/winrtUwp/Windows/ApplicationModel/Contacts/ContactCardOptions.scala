package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data about how to display a mini contact card. */
@js.native
trait ContactCardOptions extends StObject {
  
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  var headerKind: ContactCardHeaderKind = js.native
  
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  var initialTabKind: ContactCardTabKind = js.native
  
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  var serverSearchContactListIds: IVector[String] = js.native
}
object ContactCardOptions {
  
  @scala.inline
  def apply(
    headerKind: ContactCardHeaderKind,
    initialTabKind: ContactCardTabKind,
    serverSearchContactListIds: IVector[String]
  ): ContactCardOptions = {
    val __obj = js.Dynamic.literal(headerKind = headerKind.asInstanceOf[js.Any], initialTabKind = initialTabKind.asInstanceOf[js.Any], serverSearchContactListIds = serverSearchContactListIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactCardOptions]
  }
  
  @scala.inline
  implicit class ContactCardOptionsMutableBuilder[Self <: ContactCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderKind(value: ContactCardHeaderKind): Self = StObject.set(x, "headerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTabKind(value: ContactCardTabKind): Self = StObject.set(x, "initialTabKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSearchContactListIds(value: IVector[String]): Self = StObject.set(x, "serverSearchContactListIds", value.asInstanceOf[js.Any])
  }
}
