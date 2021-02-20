package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportGitSource extends StObject {
  
  /**
    * Tells if this is a sync request or not
    */
  var overwrite: Boolean = js.native
  
  /**
    * Url for the source repo
    */
  var url: String = js.native
}
object GitImportGitSource {
  
  @scala.inline
  def apply(overwrite: Boolean, url: String): GitImportGitSource = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportGitSource]
  }
  
  @scala.inline
  implicit class GitImportGitSourceMutableBuilder[Self <: GitImportGitSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
