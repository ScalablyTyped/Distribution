package typings.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the changed event of a vector. */
@js.native
trait IVectorChangedEventArgs extends js.Object {
  
  /** Gets the type of change that occurred in the vector. */
  var collectionChange: CollectionChange = js.native
  
  /** Gets the position where the change occurred in the vector. */
  var index: Double = js.native
}
object IVectorChangedEventArgs {
  
  @scala.inline
  def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVectorChangedEventArgs]
  }
  
  @scala.inline
  implicit class IVectorChangedEventArgsOps[Self <: IVectorChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCollectionChange(value: CollectionChange): Self = this.set("collectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
