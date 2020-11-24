package typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAny
import typings.tensorflowTfjsConverter.compiledApiMod.IOpList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MetaInfoDef. */
@js.native
trait IMetaInfoDef extends js.Object {
  
  /** MetaInfoDef anyInfo */
  var anyInfo: js.UndefOr[IAny | Null] = js.native
  
  /** MetaInfoDef metaGraphVersion */
  var metaGraphVersion: js.UndefOr[String | Null] = js.native
  
  /** MetaInfoDef strippedOpList */
  var strippedOpList: js.UndefOr[IOpList | Null] = js.native
  
  /** MetaInfoDef tags */
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** MetaInfoDef tensorflowGitVersion */
  var tensorflowGitVersion: js.UndefOr[String | Null] = js.native
  
  /** MetaInfoDef tensorflowVersion */
  var tensorflowVersion: js.UndefOr[String | Null] = js.native
}
object IMetaInfoDef {
  
  @scala.inline
  def apply(): IMetaInfoDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetaInfoDef]
  }
  
  @scala.inline
  implicit class IMetaInfoDefOps[Self <: IMetaInfoDef] (val x: Self) extends AnyVal {
    
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
    def setAnyInfo(value: IAny): Self = this.set("anyInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyInfo: Self = this.set("anyInfo", js.undefined)
    
    @scala.inline
    def setAnyInfoNull: Self = this.set("anyInfo", null)
    
    @scala.inline
    def setMetaGraphVersion(value: String): Self = this.set("metaGraphVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaGraphVersion: Self = this.set("metaGraphVersion", js.undefined)
    
    @scala.inline
    def setMetaGraphVersionNull: Self = this.set("metaGraphVersion", null)
    
    @scala.inline
    def setStrippedOpList(value: IOpList): Self = this.set("strippedOpList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrippedOpList: Self = this.set("strippedOpList", js.undefined)
    
    @scala.inline
    def setStrippedOpListNull: Self = this.set("strippedOpList", null)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    
    @scala.inline
    def setTensorflowGitVersion(value: String): Self = this.set("tensorflowGitVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowGitVersion: Self = this.set("tensorflowGitVersion", js.undefined)
    
    @scala.inline
    def setTensorflowGitVersionNull: Self = this.set("tensorflowGitVersion", null)
    
    @scala.inline
    def setTensorflowVersion(value: String): Self = this.set("tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersion: Self = this.set("tensorflowVersion", js.undefined)
    
    @scala.inline
    def setTensorflowVersionNull: Self = this.set("tensorflowVersion", null)
  }
}
