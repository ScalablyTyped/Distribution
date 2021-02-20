package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractBase extends StObject {
  
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  
  /** The container of this type. */
  var parent: AbstractBase | Null = js.native
  
  /** String indicating the type of this node. */
  var `type`: String | Null = js.native
}
object AbstractBase {
  
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute]): AbstractBase = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBase]
  }
  
  @scala.inline
  implicit class AbstractBaseMutableBuilder[Self <: AbstractBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = StObject.set(x, "extAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = StObject.set(x, "extAttrs", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: AbstractBase): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
