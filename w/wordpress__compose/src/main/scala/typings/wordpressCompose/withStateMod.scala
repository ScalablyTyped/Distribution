package typings.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.setState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose/higher-order/with-state", JSImport.Namespace)
@js.native
object withStateMod extends js.Object {
  // prettier-ignore
  def default[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typings.wordpressCompose.wordpressComposeStrings.default with TopLevel[SP]
  ): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[_, (/* keyof SP */ String) | setState], SP]
  ] = js.native
}

