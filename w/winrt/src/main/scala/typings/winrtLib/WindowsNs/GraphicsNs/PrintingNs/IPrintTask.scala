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

object IPrintTask {
  @scala.inline
  def apply(
    oncompleted: js.Any,
    onpreviewing: js.Any,
    onprogressing: js.Any,
    onsubmitting: js.Any,
    options: PrintTaskOptions,
    properties: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackagePropertySet,
    source: IPrintDocumentSource
  ): IPrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted, onpreviewing = onpreviewing, onprogressing = onprogressing, onsubmitting = onsubmitting, options = options, properties = properties, source = source)
  
    __obj.asInstanceOf[IPrintTask]
  }
}

