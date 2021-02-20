package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamType extends StObject {
  
  var elements: js.UndefOr[js.Array[ParamType]] = js.native
  
  var name: String = js.native
}
object ParamType {
  
  @scala.inline
  def apply(name: String): ParamType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamType]
  }
  
  @scala.inline
  implicit class ParamTypeMutableBuilder[Self <: ParamType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[ParamType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: ParamType*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
