package typings.wordpressData.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/data", "withSelect")
@js.native
object withSelect extends js.Object {
  
  def apply[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P with IP, SP]
  ): js.Function1[/* component */ ComponentType[P with IP with SP], ComponentType[P]] = js.native
}
