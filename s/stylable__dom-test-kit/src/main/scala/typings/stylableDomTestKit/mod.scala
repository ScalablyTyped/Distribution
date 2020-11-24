package typings.stylableDomTestKit

import typings.std.Element
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/dom-test-kit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class StylableDOMUtil protected ()
    extends typings.stylableDomTestKit.stylableDomUtilMod.StylableDOMUtil {
    def this(stylesheet: RuntimeStylesheet) = this()
    def this(stylesheet: RuntimeStylesheet, root: Element) = this()
  }
}
