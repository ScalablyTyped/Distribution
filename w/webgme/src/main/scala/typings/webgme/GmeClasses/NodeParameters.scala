package typings.webgme.GmeClasses

import typings.webgme.Core.GUID
import typings.webgme.Core.Node
import typings.webgme.GmeCommon.RelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeParameters extends js.Object {
  
  /** the base of the node to be created. */
  var base: js.UndefOr[Node | Null] = js.native
  
  /** the GUID of the node to be created */
  var guid: js.UndefOr[GUID] = js.native
  
  /** the parent of the node to be created. */
  var parent: js.UndefOr[Node | Null] = js.native
  
  /** the relative id of the node to be created 
    * (if reserved, the function returns the node behind the relative id) */
  var relid: js.UndefOr[RelId] = js.native
}
object NodeParameters {
  
  @scala.inline
  def apply(): NodeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeParameters]
  }
  
  @scala.inline
  implicit class NodeParametersOps[Self <: NodeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase(value: Node): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setBaseNull: Self = this.set("base", null)
    
    @scala.inline
    def setGuid(value: GUID): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setParent(value: Node): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setRelid(value: RelId): Self = this.set("relid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelid: Self = this.set("relid", js.undefined)
  }
}
