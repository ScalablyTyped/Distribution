package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTask extends js.Object {
  var oncompleted: js.Any = js.native
  var onpreviewing: js.Any = js.native
  var onprogressing: js.Any = js.native
  var onsubmitting: js.Any = js.native
  var options: PrintTaskOptions = js.native
  var properties: DataPackagePropertySet = js.native
  var source: IPrintDocumentSource = js.native
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
  @scala.inline
  implicit class IPrintTaskOps[Self <: IPrintTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOncompleted(value: js.Any): Self = this.set("oncompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpreviewing(value: js.Any): Self = this.set("onpreviewing", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnprogressing(value: js.Any): Self = this.set("onprogressing", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsubmitting(value: js.Any): Self = this.set("onsubmitting", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: PrintTaskOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: DataPackagePropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: IPrintDocumentSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

