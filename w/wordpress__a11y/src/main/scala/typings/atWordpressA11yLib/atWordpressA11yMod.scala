package typings
package atWordpressA11yLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/a11y", JSImport.Namespace)
@js.native
object atWordpressA11yMod extends js.Object {
  def setup(): scala.Unit = js.native
  def speak(message: java.lang.String): scala.Unit = js.native
  @JSName("speak")
  def speak_assertive(message: java.lang.String, ariaLive: atWordpressA11yLib.atWordpressA11yLibStrings.assertive): scala.Unit = js.native
  @JSName("speak")
  def speak_polite(message: java.lang.String, ariaLive: atWordpressA11yLib.atWordpressA11yLibStrings.polite): scala.Unit = js.native
}

