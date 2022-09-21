package typings.tokeyCssSelectorParser

import typings.tokeyCssSelectorParser.astTypesMod.ImmutableNthSelectorList
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelectorList
import typings.tokeyCssSelectorParser.astTypesMod.ImmutableSelectorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("@tokey/css-selector-parser/dist/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifySelectorAst(value: ImmutableSelectorList | ImmutableSelectorNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifySelectorAst(value: ImmutableNthSelectorList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
