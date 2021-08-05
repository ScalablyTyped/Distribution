package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.RootNode
  - typings.vueCompilerCore.mod.ElementNode
  - typings.vueCompilerCore.mod.IfBranchNode
  - typings.vueCompilerCore.mod.ForNode
*/
trait ParentNode2 extends StObject
object ParentNode2 {
  
  inline def ComponentNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 1)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ComponentNode]
  }
  
  inline def ForNode(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode
  ): typings.vueCompilerCore.mod.ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(11)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ForNode]
  }
  
  inline def IfBranchNode(children: js.Array[TemplateChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(10)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.IfBranchNode]
  }
  
  inline def PlainElementNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 0)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.PlainElementNode]
  }
  
  inline def RootNode(
    cached: Double,
    children: js.Array[TemplateChildNode],
    components: js.Array[String],
    directives: js.Array[String],
    helpers: js.Array[js.Symbol],
    hoists: js.Array[JSChildNode | Null],
    imports: js.Array[ImportItem],
    loc: SourceLocation,
    temps: Double
  ): typings.vueCompilerCore.mod.RootNode = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], hoists = hoists.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.RootNode]
  }
  
  inline def SlotOutletNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 2)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SlotOutletNode]
  }
  
  inline def TemplateNode(
    children: js.Array[TemplateChildNode],
    codegenNode: Unit,
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], codegenNode = codegenNode.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 3)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TemplateNode]
  }
}
