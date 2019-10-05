package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintManager extends js.Object {
  var onprinttaskrequested: js.Any
}

object IPrintManager {
  @scala.inline
  def apply(onprinttaskrequested: js.Any): IPrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested)
  
    __obj.asInstanceOf[IPrintManager]
  }
}

