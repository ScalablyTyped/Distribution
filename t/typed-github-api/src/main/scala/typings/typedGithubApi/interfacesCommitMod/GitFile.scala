package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.typedGithubApiStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitFile extends js.Object {
  
  var changes: GitChanges = js.native
  
  var filename: String = js.native
  
  var patch: String = js.native
  
  var status: modified = js.native
}
object GitFile {
  
  @scala.inline
  def apply(changes: GitChanges, filename: String, patch: String, status: modified): GitFile = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitFile]
  }
  
  @scala.inline
  implicit class GitFileOps[Self <: GitFile] (val x: Self) extends AnyVal {
    
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
    def setChanges(value: GitChanges): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: modified): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
