package typings.vueInbrowserCompilerUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueInbrowserCompilerUtils.typesMod.ParamTag
  - typings.vueInbrowserCompilerUtils.typesMod.Tag
*/
trait BlockTag extends js.Object
object BlockTag {
  
  @scala.inline
  def ParamTag(title: String): BlockTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockTag]
  }
  
  @scala.inline
  def Tag(content: String | Boolean, title: String): BlockTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockTag]
  }
}
