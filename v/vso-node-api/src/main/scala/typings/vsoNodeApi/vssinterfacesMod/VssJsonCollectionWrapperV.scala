package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VssJsonCollectionWrapperV[T] extends VssJsonCollectionWrapperBase {
  
  var value: T = js.native
}
object VssJsonCollectionWrapperV {
  
  @scala.inline
  def apply[T](count: Double, value: T): VssJsonCollectionWrapperV[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperV[T]]
  }
  
  @scala.inline
  implicit class VssJsonCollectionWrapperVMutableBuilder[Self <: VssJsonCollectionWrapperV[_], T] (val x: Self with VssJsonCollectionWrapperV[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
