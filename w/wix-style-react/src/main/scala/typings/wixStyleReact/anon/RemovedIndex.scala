package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedIndex extends StObject {
  
  var addedIndex: Double
  
  var removedIndex: Double
}
object RemovedIndex {
  
  @scala.inline
  def apply(addedIndex: Double, removedIndex: Double): RemovedIndex = {
    val __obj = js.Dynamic.literal(addedIndex = addedIndex.asInstanceOf[js.Any], removedIndex = removedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedIndex]
  }
  
  @scala.inline
  implicit class RemovedIndexMutableBuilder[Self <: RemovedIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedIndex(value: Double): Self = StObject.set(x, "addedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedIndex(value: Double): Self = StObject.set(x, "removedIndex", value.asInstanceOf[js.Any])
  }
}
