package typings.yarnpkgParsers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGrammarsSymlMod {
  
  @JSImport("@yarnpkg/parsers/lib/grammars/syml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(code: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
}
