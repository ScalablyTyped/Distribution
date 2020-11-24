package typings.stylableCore.stylableProcessorMod

import typings.postcss.mod.Rule_
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.complex
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableMetaMod.RefedMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SRule extends Rule_ {
  
  var isSimpleSelector: Boolean = js.native
  
  var mixins: js.UndefOr[js.Array[RefedMixin]] = js.native
  
  var selectorAst: SelectorAstNode = js.native
  
  var selectorType: `class` | element | complex = js.native
  
  var stScopeSelector: js.UndefOr[String] = js.native
}
