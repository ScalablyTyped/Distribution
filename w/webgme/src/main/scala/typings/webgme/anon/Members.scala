package typings.webgme.anon

import typings.webgme.Core.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[Node]] = js.undefined
  
  /** the name of the set. */
  var name: typings.webgme.GmeCommon.Name
  
  /** the node in question. */
  var node: Node
}
object Members {
  
  @scala.inline
  def apply(name: typings.webgme.GmeCommon.Name, node: Node): Members = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit class MembersMutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[Node]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: Node*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: typings.webgme.GmeCommon.Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
