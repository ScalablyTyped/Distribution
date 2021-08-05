package typings.vueDocgenApi

import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseSFCMod {
  
  @JSImport("vue-docgen-api/dist/parseSFC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(initialDoc: Unit, source: String, opt: ParseOptions): js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialDoc.asInstanceOf[js.Any], source.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]]]
  inline def default(initialDoc: typings.vueDocgenApi.documentationMod.default, source: String, opt: ParseOptions): js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialDoc.asInstanceOf[js.Any], source.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]]]
}
