package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpList extends StObject {
  
  /** OpList op */
  var op: js.UndefOr[js.Array[IOpDef] | Null] = js.native
}
object IOpList {
  
  @scala.inline
  def apply(): IOpList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpList]
  }
  
  @scala.inline
  implicit class IOpListMutableBuilder[Self <: IOpList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: js.Array[IOpDef]): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpNull: Self = StObject.set(x, "op", null)
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setOpVarargs(value: IOpDef*): Self = StObject.set(x, "op", js.Array(value :_*))
  }
}
