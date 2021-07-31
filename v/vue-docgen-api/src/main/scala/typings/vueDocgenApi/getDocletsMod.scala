package typings.vueDocgenApi

import typings.vueInbrowserCompilerUtils.typesMod.DocBlockTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocletsMod {
  
  @JSImport("vue-docgen-api/dist/utils/getDoclets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(str: String): DocBlockTags = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[DocBlockTags]
}
