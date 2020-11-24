package typings.tsLoader.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsLoaderDefinitionFileVersions extends js.Object {
  
  var tsLoaderDefinitionFileVersions: js.Array[String] = js.native
  
  var tsLoaderFileVersion: Double = js.native
}
object TsLoaderDefinitionFileVersions {
  
  @scala.inline
  def apply(tsLoaderDefinitionFileVersions: js.Array[String], tsLoaderFileVersion: Double): TsLoaderDefinitionFileVersions = {
    val __obj = js.Dynamic.literal(tsLoaderDefinitionFileVersions = tsLoaderDefinitionFileVersions.asInstanceOf[js.Any], tsLoaderFileVersion = tsLoaderFileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsLoaderDefinitionFileVersions]
  }
  
  @scala.inline
  implicit class TsLoaderDefinitionFileVersionsOps[Self <: TsLoaderDefinitionFileVersions] (val x: Self) extends AnyVal {
    
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
    def setTsLoaderDefinitionFileVersionsVarargs(value: String*): Self = this.set("tsLoaderDefinitionFileVersions", js.Array(value :_*))
    
    @scala.inline
    def setTsLoaderDefinitionFileVersions(value: js.Array[String]): Self = this.set("tsLoaderDefinitionFileVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsLoaderFileVersion(value: Double): Self = this.set("tsLoaderFileVersion", value.asInstanceOf[js.Any])
  }
}
