package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsIPlayReadyLicense extends js.Object {
  /** The items in the collection. */ var items: IPlayReadyLicense
  /** The number of items in the collection. */ var returnValue: Double
}

object ItemsIPlayReadyLicense {
  @scala.inline
  def apply(items: IPlayReadyLicense, returnValue: Double): ItemsIPlayReadyLicense = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyLicense]
  }
}

