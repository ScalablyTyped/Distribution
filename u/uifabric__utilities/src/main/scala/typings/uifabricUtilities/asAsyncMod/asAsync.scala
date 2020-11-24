package typings.uifabricUtilities.asAsyncMod

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.uifabricUtilities.anon.AsyncPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/asAsync", "asAsync")
@js.native
object asAsync extends js.Object {
  
  def apply[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[
    (PropsWithoutRef[TProps with AsyncPlaceholder]) with RefAttributes[ElementType[TProps]]
  ] = js.native
}
