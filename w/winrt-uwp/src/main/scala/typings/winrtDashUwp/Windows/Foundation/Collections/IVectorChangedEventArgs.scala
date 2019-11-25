package typings.winrtDashUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a vector. */
trait IVectorChangedEventArgs extends js.Object {
  /** Gets the type of change that occurred in the vector. */
  var collectionChange: CollectionChange
  /** Gets the position where the change occurred in the vector. */
  var index: Double
}

object IVectorChangedEventArgs {
  @scala.inline
  def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVectorChangedEventArgs]
  }
}

