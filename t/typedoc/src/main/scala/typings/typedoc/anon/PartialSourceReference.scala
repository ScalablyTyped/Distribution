package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.SourceReference> */
@js.native
trait PartialSourceReference extends js.Object {
  
  var character: js.UndefOr[ModelToObject[Double] | Double] = js.native
  
  var fileName: js.UndefOr[ModelToObject[String] | String] = js.native
  
  var line: js.UndefOr[ModelToObject[Double] | Double] = js.native
}
object PartialSourceReference {
  
  @scala.inline
  def apply(): PartialSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceReference]
  }
  
  @scala.inline
  implicit class PartialSourceReferenceOps[Self <: PartialSourceReference] (val x: Self) extends AnyVal {
    
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
    def setCharacterVarargs(value: _ModelToObject[js.Any]*): Self = this.set("character", js.Array(value :_*))
    
    @scala.inline
    def setCharacter(value: ModelToObject[Double] | Double): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    
    @scala.inline
    def setFileNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("fileName", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: ModelToObject[String] | String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: _ModelToObject[js.Any]*): Self = this.set("line", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: ModelToObject[Double] | Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
}
