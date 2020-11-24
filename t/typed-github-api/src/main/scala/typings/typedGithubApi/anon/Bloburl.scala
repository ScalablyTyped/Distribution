package typings.typedGithubApi.anon

import typings.typedGithubApi.typedGithubApiStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bloburl extends js.Object {
  
  var additions: Double = js.native
  
  var blob_url: String = js.native
  
  var changes: Double = js.native
  
  var deletions: Double = js.native
  
  var filename: String = js.native
  
  var patch: String = js.native
  
  var raw_url: String = js.native
  
  var status: modified = js.native
}
object Bloburl {
  
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    status: modified
  ): Bloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloburl]
  }
  
  @scala.inline
  implicit class BloburlOps[Self <: Bloburl] (val x: Self) extends AnyVal {
    
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
    def setAdditions(value: Double): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob_url(value: String): Self = this.set("blob_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: Double): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletions(value: Double): Self = this.set("deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_url(value: String): Self = this.set("raw_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: modified): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
