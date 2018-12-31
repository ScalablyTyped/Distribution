package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUICommandFactory extends js.Object {
  def create(label: java.lang.String): UICommand
  def createWithHandler(label: java.lang.String, action: UICommandInvokedHandler): UICommand
  def createWithHandlerAndId(label: java.lang.String, action: UICommandInvokedHandler, commandId: js.Any): UICommand
}

