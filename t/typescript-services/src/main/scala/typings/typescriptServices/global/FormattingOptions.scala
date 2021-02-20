package typings.typescriptServices.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FormattingOptions")
@js.native
class FormattingOptions protected ()
  extends typings.typescriptServices.FormattingOptions {
  def this(useTabs: Boolean, spacesPerTab: Double, indentSpaces: Double, newLineCharacter: String) = this()
}
object FormattingOptions {
  
  @JSGlobal("FormattingOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("FormattingOptions.defaultOptions")
  @js.native
  def defaultOptions: typings.typescriptServices.FormattingOptions = js.native
  @scala.inline
  def defaultOptions_=(x: typings.typescriptServices.FormattingOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
