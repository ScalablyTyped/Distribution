package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector4
import typings.vegaTypings.vegaTypingsStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector4[String | SignalRef]) | SignalRef] = js.native
  
  var field: js.UndefOr[FieldRef] = js.native
  
  var method: js.UndefOr[TreeMethod | SignalRef] = js.native
  
  var nodeSize: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var separation: js.UndefOr[Boolean | SignalRef] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: tree = js.native
}
object TreeTransform {
  
  @scala.inline
  def apply(`type`: tree): TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTransform]
  }
  
  @scala.inline
  implicit class TreeTransformOps[Self <: TreeTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: tree): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: (Vector4[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setMethod(value: TreeMethod | SignalRef): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNodeSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeSize: Self = this.set("nodeSize", js.undefined)
    
    @scala.inline
    def setSeparation(value: Boolean | SignalRef): Self = this.set("separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparation: Self = this.set("separation", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
