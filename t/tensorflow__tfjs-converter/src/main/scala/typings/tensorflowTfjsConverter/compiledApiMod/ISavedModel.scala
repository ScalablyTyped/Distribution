package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISavedModel extends js.Object {
  
  /** SavedModel metaGraphs */
  var metaGraphs: js.UndefOr[js.Array[IMetaGraphDef] | Null] = js.native
  
  /** SavedModel savedModelSchemaVersion */
  var savedModelSchemaVersion: js.UndefOr[Double | String | Null] = js.native
}
object ISavedModel {
  
  @scala.inline
  def apply(): ISavedModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISavedModel]
  }
  
  @scala.inline
  implicit class ISavedModelOps[Self <: ISavedModel] (val x: Self) extends AnyVal {
    
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
    def setMetaGraphsVarargs(value: IMetaGraphDef*): Self = this.set("metaGraphs", js.Array(value :_*))
    
    @scala.inline
    def setMetaGraphs(value: js.Array[IMetaGraphDef]): Self = this.set("metaGraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaGraphs: Self = this.set("metaGraphs", js.undefined)
    
    @scala.inline
    def setMetaGraphsNull: Self = this.set("metaGraphs", null)
    
    @scala.inline
    def setSavedModelSchemaVersion(value: Double | String): Self = this.set("savedModelSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedModelSchemaVersion: Self = this.set("savedModelSchemaVersion", js.undefined)
    
    @scala.inline
    def setSavedModelSchemaVersionNull: Self = this.set("savedModelSchemaVersion", null)
  }
}
