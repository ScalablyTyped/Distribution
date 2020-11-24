package typings.webgme.v1Mod

import typings.webgme.GmeCommon.RelId
import typings.webgme.anon.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonObj extends js.Object {
  
   // guid tree of hashes
  var bases: js.Any = js.native
  
  var containment: JsonContainment = js.native
  
  var metaSheets: js.Any = js.native
  
   //
  var nodes: js.Any = js.native
  
  var relids: js.Array[RelId] = js.native
  
  var root: Guid = js.native
}
object JsonObj {
  
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[RelId],
    root: Guid
  ): JsonObj = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonObj]
  }
  
  @scala.inline
  implicit class JsonObjOps[Self <: JsonObj] (val x: Self) extends AnyVal {
    
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
    def setBases(value: js.Any): Self = this.set("bases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainment(value: JsonContainment): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaSheets(value: js.Any): Self = this.set("metaSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Any): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelidsVarargs(value: RelId*): Self = this.set("relids", js.Array(value :_*))
    
    @scala.inline
    def setRelids(value: js.Array[RelId]): Self = this.set("relids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Guid): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
