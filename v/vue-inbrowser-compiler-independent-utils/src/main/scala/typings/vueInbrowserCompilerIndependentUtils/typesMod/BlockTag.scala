package typings.vueInbrowserCompilerIndependentUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueInbrowserCompilerIndependentUtils.typesMod.ParamTag
  - typings.vueInbrowserCompilerIndependentUtils.typesMod.Tag
*/
trait BlockTag extends StObject
object BlockTag {
  
  inline def ParamTag(title: String): typings.vueInbrowserCompilerIndependentUtils.typesMod.ParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerIndependentUtils.typesMod.ParamTag]
  }
  
  inline def Tag(content: String | Boolean, title: String): typings.vueInbrowserCompilerIndependentUtils.typesMod.Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerIndependentUtils.typesMod.Tag]
  }
}
