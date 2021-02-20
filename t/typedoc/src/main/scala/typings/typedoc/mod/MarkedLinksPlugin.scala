package typings.typedoc.mod

import typings.typedoc.anon.Caption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "MarkedLinksPlugin")
@js.native
class MarkedLinksPlugin protected ()
  extends typings.typedoc.outputPluginsMod.MarkedLinksPlugin {
  def this(owner: js.Symbol) = this()
  def this(owner: typings.typedoc.rendererMod.Renderer) = this()
}
/* static members */
object MarkedLinksPlugin {
  
  @JSImport("typedoc", "MarkedLinksPlugin.splitLinkText")
  @js.native
  def splitLinkText(text: String): Caption = js.native
}
