package typings.vueInbrowserCompilerIndependentUtils.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueInbrowserCompilerIndependentUtils.libTypesMod.ParamTag
  - typings.vueInbrowserCompilerIndependentUtils.libTypesMod.Tag
*/
trait BlockTag extends StObject
object BlockTag {
  
  inline def ParamTag(title: String): typings.vueInbrowserCompilerIndependentUtils.libTypesMod.ParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerIndependentUtils.libTypesMod.ParamTag]
  }
  
  inline def Tag(content: String | Boolean, title: String): typings.vueInbrowserCompilerIndependentUtils.libTypesMod.Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerIndependentUtils.libTypesMod.Tag]
  }
}
