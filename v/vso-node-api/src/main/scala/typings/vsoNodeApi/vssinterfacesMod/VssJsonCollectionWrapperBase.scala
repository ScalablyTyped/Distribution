package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VssJsonCollectionWrapperBase extends StObject {
  
  var count: Double = js.native
}
object VssJsonCollectionWrapperBase {
  
  @scala.inline
  def apply(count: Double): VssJsonCollectionWrapperBase = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperBase]
  }
  
  @scala.inline
  implicit class VssJsonCollectionWrapperBaseMutableBuilder[Self <: VssJsonCollectionWrapperBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
