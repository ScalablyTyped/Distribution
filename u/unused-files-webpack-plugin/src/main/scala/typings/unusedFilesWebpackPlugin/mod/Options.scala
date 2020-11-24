package typings.unusedFilesWebpackPlugin.mod

import typings.unusedFilesWebpackPlugin.anon.Ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var failOnUnused: Boolean = js.native
  
  var globOptions: js.UndefOr[Ignore] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var patterns: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(failOnUnused: Boolean): Options = {
    val __obj = js.Dynamic.literal(failOnUnused = failOnUnused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFailOnUnused(value: Boolean): Self = this.set("failOnUnused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setGlobOptions(value: Ignore): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
  }
}
