package typings.typedoc

import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsTsutilsMod {
  
  @JSImport("typedoc/dist/lib/utils/tsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQualifiedName(checker: TypeChecker, symbol: Symbol): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQualifiedName")(checker.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[String]
}
