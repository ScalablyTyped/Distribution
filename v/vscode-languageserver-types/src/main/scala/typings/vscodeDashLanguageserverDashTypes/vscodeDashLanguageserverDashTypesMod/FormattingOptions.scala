package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ StringDictionary[Boolean | Double | String] {
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double
}

@JSImport("vscode-languageserver-types", "FormattingOptions")
@js.native
object FormattingOptions extends js.Object {
  /**
    * Creates a new FormattingOptions literal.
    */
  def create(tabSize: Double, insertSpaces: Boolean): FormattingOptions = js.native
  /**
    * Checks whether the given literal conforms to the [FormattingOptions](#FormattingOptions) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = js.native
}

