package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractContainer extends AbstractBase {
  
  /** An array of container members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[AbstractBase] = js.native
  
  /** The name of the container. */
  var name: String = js.native
  
  /** A boolean indicating whether this container is partial. */
  var partial: Boolean = js.native
}
object AbstractContainer {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[AbstractBase],
    name: String,
    partial: Boolean
  ): AbstractContainer = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractContainer]
  }
  
  @scala.inline
  implicit class AbstractContainerMutableBuilder[Self <: AbstractContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[AbstractBase]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: AbstractBase*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
  }
}
