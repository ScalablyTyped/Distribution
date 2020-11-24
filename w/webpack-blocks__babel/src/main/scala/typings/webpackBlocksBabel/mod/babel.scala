package typings.webpackBlocksBabel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait babel extends js.Object {
  
  var cacheDirectory: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[js.Array[String]] = js.native
  
  var presets: js.UndefOr[js.Array[String]] = js.native
}
object babel {
  
  @scala.inline
  def apply(): babel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[babel]
  }
  
  @scala.inline
  implicit class babelOps[Self <: babel] (val x: Self) extends AnyVal {
    
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
    def setCacheDirectory(value: Boolean): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: String*): Self = this.set("presets", js.Array(value :_*))
    
    @scala.inline
    def setPresets(value: js.Array[String]): Self = this.set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
  }
}
