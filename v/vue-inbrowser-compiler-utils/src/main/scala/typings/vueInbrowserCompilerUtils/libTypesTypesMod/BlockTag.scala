package typings.vueInbrowserCompilerUtils.libTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueInbrowserCompilerUtils.libTypesTypesMod.ParamTag
  - typings.vueInbrowserCompilerUtils.libTypesTypesMod.Tag
*/
trait BlockTag extends StObject
object BlockTag {
  
  inline def ParamTag(title: String): typings.vueInbrowserCompilerUtils.libTypesTypesMod.ParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerUtils.libTypesTypesMod.ParamTag]
  }
  
  inline def Tag(content: String | Boolean, title: String): typings.vueInbrowserCompilerUtils.libTypesTypesMod.Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueInbrowserCompilerUtils.libTypesTypesMod.Tag]
  }
}
