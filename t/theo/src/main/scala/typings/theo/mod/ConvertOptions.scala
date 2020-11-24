package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertOptions extends js.Object {
  
  var format: FormatOptions = js.native
  
  var resolveAliases: js.UndefOr[Boolean] = js.native
  
  var resolveMetaAliases: js.UndefOr[Boolean] = js.native
  
  var transform: TransformOptions[scala.Nothing] = js.native
}
object ConvertOptions {
  
  @scala.inline
  def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: FormatOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: TransformOptions[scala.Nothing]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveAliases(value: Boolean): Self = this.set("resolveAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveAliases: Self = this.set("resolveAliases", js.undefined)
    
    @scala.inline
    def setResolveMetaAliases(value: Boolean): Self = this.set("resolveMetaAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveMetaAliases: Self = this.set("resolveMetaAliases", js.undefined)
  }
}
