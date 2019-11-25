package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardDataFormatsStatics extends js.Object {
  var bitmap: String
  var html: String
  var rtf: String
  var storageItems: String
  var text: String
  var uri: String
}

object IStandardDataFormatsStatics {
  @scala.inline
  def apply(bitmap: String, html: String, rtf: String, storageItems: String, text: String, uri: String): IStandardDataFormatsStatics = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], rtf = rtf.asInstanceOf[js.Any], storageItems = storageItems.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStandardDataFormatsStatics]
  }
}

