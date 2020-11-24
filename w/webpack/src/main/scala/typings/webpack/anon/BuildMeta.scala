package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildMeta extends js.Object {
  
  /**
  		 * Meta information about the module
  		 */
  var buildMeta: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  		 * Information about the provided exports of the module
  		 */
  var exports: js.UndefOr[`true` | js.Array[String]] = js.native
  
  /**
  		 * Module ID
  		 */
  var id: Double | String = js.native
}
object BuildMeta {
  
  @scala.inline
  def apply(id: Double | String): BuildMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildMeta]
  }
  
  @scala.inline
  implicit class BuildMetaOps[Self <: BuildMeta] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildMeta(value: StringDictionary[js.Any]): Self = this.set("buildMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildMeta: Self = this.set("buildMeta", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: String*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: `true` | js.Array[String]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
  }
}
