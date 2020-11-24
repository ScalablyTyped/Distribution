package typings.webpack.anon

import typings.webpack.sourceMapDevToolPluginMod.Rule
import typings.webpack.sourceMapDevToolPluginMod.Rules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends js.Object {
  
  /**
  				 * Exclude modules that match the given value from source map generation
  				 */
  var exclude: js.UndefOr[Rules] = js.native
  
  /**
  				 * Include source maps for module paths that match the given value
  				 */
  var include: js.UndefOr[Rules] = js.native
  
  /**
  				 * Include source maps for modules based on their extension (defaults to .js and .css)
  				 */
  var test: js.UndefOr[Rules] = js.native
}
object Include {
  
  @scala.inline
  def apply(): Include = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Include]
  }
  
  @scala.inline
  implicit class IncludeOps[Self <: Include] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: Rule*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Rules): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Rule*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Rules): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: Rule*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Rules): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
