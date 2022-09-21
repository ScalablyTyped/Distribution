package typings.stylableDomTestKit

import typings.std.Element
import typings.stylableDomTestKit.stylableDomUtilMod.StylesheetHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/dom-test-kit/dist", "StylableDOMUtil")
  @js.native
  open class StylableDOMUtil protected ()
    extends typings.stylableDomTestKit.stylableDomUtilMod.StylableDOMUtil {
    def this(stylesheet: StylesheetHost) = this()
    def this(stylesheet: StylesheetHost, root: Element) = this()
  }
}
