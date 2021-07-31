package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typings.vueInbrowserCompilerUtils.typesMod.BlockTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformTagsIntoObjectMod {
  
  @JSImport("vue-docgen-api/dist/utils/transformTagsIntoObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(tags: js.Array[BlockTag]): StringDictionary[js.Array[BlockTag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tags.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[BlockTag]]]
}
