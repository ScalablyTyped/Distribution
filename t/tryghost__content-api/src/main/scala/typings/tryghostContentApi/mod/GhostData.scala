package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.mod.PostOrPage
  - typings.tryghostContentApi.mod.Author
  - typings.tryghostContentApi.mod.Tag
  - typings.tryghostContentApi.mod.Settings
*/
trait GhostData extends StObject
object GhostData {
  
  @scala.inline
  def Author(id: String, slug: String): typings.tryghostContentApi.mod.Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tryghostContentApi.mod.Author]
  }
  
  @scala.inline
  def PostOrPage(id: String, slug: String): typings.tryghostContentApi.mod.PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tryghostContentApi.mod.PostOrPage]
  }
  
  @scala.inline
  def Settings(): typings.tryghostContentApi.mod.Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.tryghostContentApi.mod.Settings]
  }
  
  @scala.inline
  def Tag(id: String, slug: String): typings.tryghostContentApi.mod.Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tryghostContentApi.mod.Tag]
  }
}
