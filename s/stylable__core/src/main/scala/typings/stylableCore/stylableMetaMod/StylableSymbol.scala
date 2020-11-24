package typings.stylableCore.stylableMetaMod

import typings.postcss.mod.Node
import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.`import`
import typings.stylableCore.stylableCoreStrings.`var`
import typings.stylableCore.stylableCoreStrings.cssVar
import typings.stylableCore.stylableCoreStrings.default
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableCoreStrings.keyframes
import typings.stylableCore.stylableCoreStrings.named
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stylableCore.stylableMetaMod.ImportSymbol
  - typings.stylableCore.stylableMetaMod.VarSymbol
  - typings.stylableCore.stylableMetaMod.ClassSymbol
  - typings.stylableCore.stylableMetaMod.ElementSymbol
  - typings.stylableCore.stylableMetaMod.CSSVarSymbol
  - typings.stylableCore.stylableMetaMod.KeyframesSymbol
*/
trait StylableSymbol extends js.Object
object StylableSymbol {
  
  @scala.inline
  def ElementSymbol(_kind: element, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def KeyframesSymbol(_kind: keyframes, alias: String, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def ClassSymbol(_kind: `class`, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def VarSymbol(_kind: `var`, name: String, node: Node, text: String, value: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def CSSVarSymbol(_kind: cssVar, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def ImportSymbol(_kind: `import`, context: String, `import`: Imported, name: String, `type`: named | default): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
}
