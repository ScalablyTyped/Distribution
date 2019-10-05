package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVectorChangedEventArgs extends js.Object {
  var collectionChange: CollectionChange
  var index: Double
}

object IVectorChangedEventArgs {
  @scala.inline
  def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange, index = index)
  
    __obj.asInstanceOf[IVectorChangedEventArgs]
  }
}

