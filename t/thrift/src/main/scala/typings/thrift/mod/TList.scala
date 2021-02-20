package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TList extends StObject {
  
  var etype: Type = js.native
  
  var size: Double = js.native
}
object TList {
  
  @scala.inline
  def apply(etype: Type, size: Double): TList = {
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TList]
  }
  
  @scala.inline
  implicit class TListMutableBuilder[Self <: TList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtype(value: Type): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
