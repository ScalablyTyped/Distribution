package typings.vueCompilerSfc.mod

import typings.postcss.mod.LazyResult
import typings.postcss.mod.Result
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCStyleCompileResults extends js.Object {
  
  var code: String = js.native
  
  var dependencies: Set[String] = js.native
  
  var errors: js.Array[Error] = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
  
  var modules: js.UndefOr[Record[String, String]] = js.native
  
  var rawResult: js.UndefOr[LazyResult | Result] = js.native
}
object SFCStyleCompileResults {
  
  @scala.inline
  def apply(code: String, dependencies: Set[String], errors: js.Array[Error]): SFCStyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleCompileResults]
  }
  
  @scala.inline
  implicit class SFCStyleCompileResultsOps[Self <: SFCStyleCompileResults] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: Set[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setModules(value: Record[String, String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setRawResult(value: LazyResult | Result): Self = this.set("rawResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawResult: Self = this.set("rawResult", js.undefined)
  }
}
