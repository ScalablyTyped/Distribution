package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractContainer
  extends StObject
     with AbstractBase {
  
  /** An array of container members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[AbstractBase]
  
  /** The name of the container. */
  var name: String
  
  /** A boolean indicating whether this container is partial. */
  var partial: Boolean
}
object AbstractContainer {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[AbstractBase],
    name: String,
    partial: Boolean
  ): AbstractContainer = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[AbstractContainer]
  }
  
  extension [Self <: AbstractContainer](x: Self) {
    
    inline def setMembers(value: js.Array[AbstractBase]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: AbstractBase*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
  }
}
