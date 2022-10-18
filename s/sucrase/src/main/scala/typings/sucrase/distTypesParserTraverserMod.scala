package typings.sucrase

import typings.sucrase.distTypesParserMod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTraverserMod {
  
  @JSImport("sucrase/dist/types/parser/traverser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFile(): File = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")().asInstanceOf[File]
}
