package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.mod.PostOrPage
  - typings.tryghostContentApi.mod.Author
  - typings.tryghostContentApi.mod.Tag
  - typings.tryghostContentApi.mod.Settings
*/
trait GhostData extends js.Object
object GhostData {
  
  @scala.inline
  def PostOrPage(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  
  @scala.inline
  def Author(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  
  @scala.inline
  def Tag(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  
  @scala.inline
  def Settings(): GhostData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostData]
  }
}
