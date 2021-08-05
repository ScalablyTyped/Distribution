package typings.vueDocgenApi

import typings.babelParser.mod.ParserOptions
import typings.vueDocgenApi.anon.Parse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelParserMod {
  
  @JSImport("vue-docgen-api/dist/babel-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Parse]
  inline def default(options: ParserOptions): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Parse]
}
