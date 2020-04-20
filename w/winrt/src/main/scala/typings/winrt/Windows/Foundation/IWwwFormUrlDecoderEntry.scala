package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWwwFormUrlDecoderEntry extends js.Object {
  var name: String
  var value: String
}

object IWwwFormUrlDecoderEntry {
  @scala.inline
  def apply(name: String, value: String): IWwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWwwFormUrlDecoderEntry]
  }
}

