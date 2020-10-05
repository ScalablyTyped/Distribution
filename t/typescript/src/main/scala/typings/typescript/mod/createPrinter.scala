package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createPrinter")
@js.native
object createPrinter extends js.Object {
  def apply(): Printer = js.native
  def apply(printerOptions: js.UndefOr[scala.Nothing], handlers: PrintHandlers): Printer = js.native
  def apply(printerOptions: PrinterOptions): Printer = js.native
  def apply(printerOptions: PrinterOptions, handlers: PrintHandlers): Printer = js.native
}

