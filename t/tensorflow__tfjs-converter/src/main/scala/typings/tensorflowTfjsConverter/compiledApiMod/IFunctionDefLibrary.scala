package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFunctionDefLibrary extends js.Object {
  
  /** FunctionDefLibrary function */
  var function: js.UndefOr[js.Array[IFunctionDef] | Null] = js.native
  
  /** FunctionDefLibrary gradient */
  var gradient: js.UndefOr[js.Array[IGradientDef] | Null] = js.native
}
object IFunctionDefLibrary {
  
  @scala.inline
  def apply(): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
  
  @scala.inline
  implicit class IFunctionDefLibraryOps[Self <: IFunctionDefLibrary] (val x: Self) extends AnyVal {
    
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
    def setFunctionVarargs(value: IFunctionDef*): Self = this.set("function", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: js.Array[IFunctionDef]): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setFunctionNull: Self = this.set("function", null)
    
    @scala.inline
    def setGradientVarargs(value: IGradientDef*): Self = this.set("gradient", js.Array(value :_*))
    
    @scala.inline
    def setGradient(value: js.Array[IGradientDef]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setGradientNull: Self = this.set("gradient", null)
  }
}
