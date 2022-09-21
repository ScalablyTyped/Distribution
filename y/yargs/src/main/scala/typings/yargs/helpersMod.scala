package typings.yargs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("yargs/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yargs/helpers", "Parser")
  @js.native
  val Parser: typings.yargsParser.mod.Parser = js.native
  
  inline def applyExtends(config: Record[String, Any], cwd: String, mergeExtends: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyExtends")(config.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], mergeExtends.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def hideBin(argv: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideBin")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
