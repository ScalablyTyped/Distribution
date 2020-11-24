package typings.webpackBlocksTypescript.mod

import typings.webpackBlocksTypescript.anon.Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelOptions extends js.Object {
  
  var babelrc: js.UndefOr[Boolean] = js.native
  
  var presets: js.UndefOr[js.Array[js.Array[Modules | String]]] = js.native
}
object BabelOptions {
  
  @scala.inline
  def apply(): BabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelOptions]
  }
  
  @scala.inline
  implicit class BabelOptionsOps[Self <: BabelOptions] (val x: Self) extends AnyVal {
    
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
    def setBabelrc(value: Boolean): Self = this.set("babelrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelrc: Self = this.set("babelrc", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: (js.Array[Modules | String])*): Self = this.set("presets", js.Array(value :_*))
    
    @scala.inline
    def setPresets(value: js.Array[js.Array[Modules | String]]): Self = this.set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
  }
}
