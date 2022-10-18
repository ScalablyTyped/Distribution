package typings.yamlAstParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDumperMod {
  
  @JSImport("yaml-ast-parser/dist/src/dumper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dump(input: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def safeDump(input: Any, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
