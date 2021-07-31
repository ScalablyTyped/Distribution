package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VssJsonCollectionWrapperV[T]
  extends StObject
     with VssJsonCollectionWrapperBase {
  
  var value: T
}
object VssJsonCollectionWrapperV {
  
  @scala.inline
  def apply[T](count: Double, value: T): VssJsonCollectionWrapperV[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperV[T]]
  }
  
  @scala.inline
  implicit class VssJsonCollectionWrapperVMutableBuilder[Self <: VssJsonCollectionWrapperV[?], T] (val x: Self & VssJsonCollectionWrapperV[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
