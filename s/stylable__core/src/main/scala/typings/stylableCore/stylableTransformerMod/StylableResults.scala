package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableResults extends js.Object {
  
  var exports: StylableExports = js.native
  
  var meta: StylableMeta = js.native
}
object StylableResults {
  
  @scala.inline
  def apply(exports: StylableExports, meta: StylableMeta): StylableResults = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableResults]
  }
  
  @scala.inline
  implicit class StylableResultsOps[Self <: StylableResults] (val x: Self) extends AnyVal {
    
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
    def setExports(value: StylableExports): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: StylableMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
