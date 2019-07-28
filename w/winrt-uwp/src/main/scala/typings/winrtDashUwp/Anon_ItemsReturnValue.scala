package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.FoundationNs.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValue extends js.Object {
  /** The name-value pairs. */ var items: IWwwFormUrlDecoderEntry
  /** The number of name-value pairs in items. */ var returnValue: Double
}

object Anon_ItemsReturnValue {
  @scala.inline
  def apply(items: IWwwFormUrlDecoderEntry, returnValue: Double): Anon_ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValue]
  }
}

