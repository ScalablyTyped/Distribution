package typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CooSparse. */
@js.native
trait ICooSparse extends js.Object {
  
  /** CooSparse denseShapeTensorName */
  var denseShapeTensorName: js.UndefOr[String | Null] = js.native
  
  /** CooSparse indicesTensorName */
  var indicesTensorName: js.UndefOr[String | Null] = js.native
  
  /** CooSparse valuesTensorName */
  var valuesTensorName: js.UndefOr[String | Null] = js.native
}
object ICooSparse {
  
  @scala.inline
  def apply(): ICooSparse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICooSparse]
  }
  
  @scala.inline
  implicit class ICooSparseOps[Self <: ICooSparse] (val x: Self) extends AnyVal {
    
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
    def setDenseShapeTensorName(value: String): Self = this.set("denseShapeTensorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenseShapeTensorName: Self = this.set("denseShapeTensorName", js.undefined)
    
    @scala.inline
    def setDenseShapeTensorNameNull: Self = this.set("denseShapeTensorName", null)
    
    @scala.inline
    def setIndicesTensorName(value: String): Self = this.set("indicesTensorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicesTensorName: Self = this.set("indicesTensorName", js.undefined)
    
    @scala.inline
    def setIndicesTensorNameNull: Self = this.set("indicesTensorName", null)
    
    @scala.inline
    def setValuesTensorName(value: String): Self = this.set("valuesTensorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesTensorName: Self = this.set("valuesTensorName", js.undefined)
    
    @scala.inline
    def setValuesTensorNameNull: Self = this.set("valuesTensorName", null)
  }
}
