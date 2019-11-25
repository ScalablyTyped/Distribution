package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTask extends js.Object {
  var oncompleted: js.Any
  var onpreviewing: js.Any
  var onprogressing: js.Any
  var onsubmitting: js.Any
  var options: PrintTaskOptions
  var properties: DataPackagePropertySet
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
    properties: DataPackagePropertySet,
    source: IPrintDocumentSource
  ): IPrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted.asInstanceOf[js.Any], onpreviewing = onpreviewing.asInstanceOf[js.Any], onprogressing = onprogressing.asInstanceOf[js.Any], onsubmitting = onsubmitting.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintTask]
  }
}

