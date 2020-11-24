package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Globalization.Calendar")
@js.native
class Calendar ()
  extends typings.winrt.Windows.Globalization.Calendar {
  def this(languages: IIterable[String]) = this()
  def this(languages: IIterable[String], calendar: String, clock: String) = this()
}
