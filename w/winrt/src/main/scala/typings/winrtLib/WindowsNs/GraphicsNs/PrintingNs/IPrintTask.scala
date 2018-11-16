package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintTask extends js.Object {
  var oncompleted: js.Any
  var onpreviewing: js.Any
  var onprogressing: js.Any
  var onsubmitting: js.Any
  var options: PrintTaskOptions
  var properties: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackagePropertySet
  var source: IPrintDocumentSource
}

