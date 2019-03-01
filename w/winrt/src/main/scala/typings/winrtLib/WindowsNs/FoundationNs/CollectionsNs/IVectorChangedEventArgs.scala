package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVectorChangedEventArgs extends js.Object {
  var collectionChange: CollectionChange
  var index: scala.Double
}

object IVectorChangedEventArgs {
  @scala.inline
  def apply(collectionChange: CollectionChange, index: scala.Double): IVectorChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectionChange")(collectionChange)
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[IVectorChangedEventArgs]
  }
}

