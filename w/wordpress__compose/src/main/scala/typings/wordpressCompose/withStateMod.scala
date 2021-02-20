package typings.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressCompose.wordpressComposeStrings.setState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStateMod {
  
  // prettier-ignore
  @JSImport("@wordpress/compose/higher-order/with-state", JSImport.Default)
  @js.native
  def default[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typings.wordpressCompose.wordpressComposeStrings.default with TopLevel[SP]
  ): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[_, (/* keyof SP */ String) | setState], SP]
  ] = js.native
}
