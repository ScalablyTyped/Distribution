package typings.winrt.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends typings.winrt.Windows.Foundation.Uri {
  def this(uri: String) = this()
  def this(baseUri: String, relativeUri: String) = this()
}
/* static members */
object Uri {
  
  @JSGlobal("Windows.Foundation.Uri.escapeComponent")
  @js.native
  def escapeComponent(toEscape: String): String = js.native
  
  @JSGlobal("Windows.Foundation.Uri.unescapeComponent")
  @js.native
  def unescapeComponent(toUnescape: String): String = js.native
}
