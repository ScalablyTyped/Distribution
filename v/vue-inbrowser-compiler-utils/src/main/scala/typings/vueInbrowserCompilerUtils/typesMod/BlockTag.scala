package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueInbrowserCompilerUtils.typesMod.ParamTag
  - typings.vueInbrowserCompilerUtils.typesMod.Tag
*/
trait BlockTag extends StObject
object BlockTag {
  
  inline def ParamTag(title: String): typings.vueInbrowserCompilerUtils.typesMod.ParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerUtils.typesMod.ParamTag]
  }
  
  inline def Tag(content: String | Boolean, title: String): typings.vueInbrowserCompilerUtils.typesMod.Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerUtils.typesMod.Tag]
  }
}
