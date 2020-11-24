package typings.wordpressData.mod

import typings.react.mod.ComponentType
import typings.wordpressData.anon.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/data", "withRegistry")
@js.native
object withRegistry extends js.Object {
  
  def apply[P](component: ComponentType[P]): ComponentType[P with Registry] = js.native
}
