package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.addressBooks.AddressBookNode
import typings.thunderbirdWebextBrowser.browser.addressBooks.CreateProperties
import typings.thunderbirdWebextBrowser.browser.addressBooks.UpdateProperties
import typings.thunderbirdWebextBrowser.browser.addressBooks.provider.AddressBooksProviderOnSearchRequestEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressBooks {
  
  @JSGlobal("browser.addressBooks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeUI(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeUI")().asInstanceOf[js.Promise[Any]]
  
  inline def create(properties: CreateProperties): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Removes an address book, and all associated contacts and mailing
    * lists.
    */
  inline def delete(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(id: String): js.Promise[AddressBookNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AddressBookNode]]
  inline def get(id: String, complete: Boolean): js.Promise[AddressBookNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddressBookNode]]
  
  inline def list(): js.Promise[js.Array[AddressBookNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[AddressBookNode]]]
  inline def list(complete: Boolean): js.Promise[js.Array[AddressBookNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(complete.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AddressBookNode]]]
  
  @JSGlobal("browser.addressBooks.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* node */ AddressBookNode, Unit]] = js.native
  
  @JSGlobal("browser.addressBooks.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function1[/* id */ String, Unit]] = js.native
  
  @JSGlobal("browser.addressBooks.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function1[/* node */ AddressBookNode, Unit]] = js.native
  
  inline def openUI(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("openUI")().asInstanceOf[js.Promise[Any]]
  
  object provider {
    
    @JSGlobal("browser.addressBooks.provider.onSearchRequest")
    @js.native
    val onSearchRequest: AddressBooksProviderOnSearchRequestEvent[
        js.Function3[
          /* node */ typings.thunderbirdWebextBrowser.browser.addressBooks.provider.AddressBookNode, 
          /* searchString */ String, 
          /* query */ js.UndefOr[String], 
          Unit
        ]
      ] = js.native
  }
  
  inline def update(id: String, properties: UpdateProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
