package typings.sucrase

import typings.std.Set
import typings.sucrase.mod.Options
import typings.sucrase.tokenProcessorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNonTypeIdentifiersMod {
  
  @JSImport("sucrase/dist/types/util/getNonTypeIdentifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNonTypeIdentifiers(tokens: default, options: Options): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNonTypeIdentifiers")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
}
