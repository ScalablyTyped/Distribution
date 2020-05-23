package typings.tabulatorTables

import typings.std.HTMLElement
import typings.tabulatorTables.Tabulator.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  // Tabulator.prototype.(?!registerModule|helpers|_)\w+
  @js.native
  class Tabulator protected ()
    extends typings.tabulatorTables.Tabulator {
    def this(selector: String) = this()
    def this(selector: HTMLElement) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: HTMLElement, options: Options) = this()
  }
  
}

