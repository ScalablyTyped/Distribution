package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.wixStyleReact.anon.DisabledId
import typings.wixStyleReact.anon.ImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contactItemBuilderMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/ContactItemBuilder", JSImport.Default)
  @js.native
  val default: ContactItemBuilderFn = js.native
  
  @JSImport("wix-style-react/dist/es/src/ContactItemBuilder", "contactItemBuilder")
  @js.native
  val contactItemBuilder: ContactItemBuilderFn = js.native
  
  type ContactItemBuilderFn = js.Function1[/* data */ ImageUrl, DisabledId]
  
  type _To = ContactItemBuilderFn
  
  /* This means you don't have to write `default`, but can instead just say `contactItemBuilderMod.foo` */
  override def _to: ContactItemBuilderFn = default
}
