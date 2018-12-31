package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialog extends js.Object {
  var cancelCommandIndex: scala.Double
  var commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand]
  var content: java.lang.String
  var defaultCommandIndex: scala.Double
  var options: MessageDialogOptions
  var title: java.lang.String
  def showAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand]
}

