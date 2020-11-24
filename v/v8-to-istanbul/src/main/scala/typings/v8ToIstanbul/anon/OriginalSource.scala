package typings.v8ToIstanbul.anon

import typings.v8ToIstanbul.mod.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalSource extends Sources {
  
  var originalSource: String = js.native
  
  var source: String = js.native
  
  var sourceMap: Sourcemap = js.native
}
object OriginalSource {
  
  @scala.inline
  def apply(originalSource: String, source: String, sourceMap: Sourcemap): OriginalSource = {
    val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalSource]
  }
  
  @scala.inline
  implicit class OriginalSourceOps[Self <: OriginalSource] (val x: Self) extends AnyVal {
    
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
    def setOriginalSource(value: String): Self = this.set("originalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMap(value: Sourcemap): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
  }
}
