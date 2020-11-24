package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootNode
  extends Node2
     with ParentNode2 {
  
  var cached: Double = js.native
  
  var children: js.Array[TemplateChildNode] = js.native
  
  var codegenNode: js.UndefOr[TemplateChildNode | JSChildNode | BlockStatement] = js.native
  
  var components: js.Array[String] = js.native
  
  var directives: js.Array[String] = js.native
  
  var helpers: js.Array[js.Symbol] = js.native
  
  var hoists: js.Array[JSChildNode | Null] = js.native
  
  var imports: js.Array[ImportItem] = js.native
  
  var ssrHelpers: js.UndefOr[js.Array[js.Symbol]] = js.native
  
  var temps: Double = js.native
  
  @JSName("type")
  var type_RootNode: `0` = js.native
}
object RootNode {
  
  @scala.inline
  def apply(
    cached: Double,
    children: js.Array[TemplateChildNode],
    components: js.Array[String],
    directives: js.Array[String],
    helpers: js.Array[js.Symbol],
    hoists: js.Array[JSChildNode | Null],
    imports: js.Array[ImportItem],
    loc: SourceLocation,
    temps: Double,
    `type`: `0`
  ): RootNode = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], hoists = hoists.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNode]
  }
  
  @scala.inline
  implicit class RootNodeOps[Self <: RootNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCached(value: Double): Self = this.set("cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: String*): Self = this.set("components", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[String]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: String*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[String]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpersVarargs(value: js.Symbol*): Self = this.set("helpers", js.Array(value :_*))
    
    @scala.inline
    def setHelpers(value: js.Array[js.Symbol]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoistsVarargs(value: (JSChildNode | Null)*): Self = this.set("hoists", js.Array(value :_*))
    
    @scala.inline
    def setHoists(value: js.Array[JSChildNode | Null]): Self = this.set("hoists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: ImportItem*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[ImportItem]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemps(value: Double): Self = this.set("temps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNode(value: TemplateChildNode | JSChildNode | BlockStatement): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegenNode: Self = this.set("codegenNode", js.undefined)
    
    @scala.inline
    def setSsrHelpersVarargs(value: js.Symbol*): Self = this.set("ssrHelpers", js.Array(value :_*))
    
    @scala.inline
    def setSsrHelpers(value: js.Array[js.Symbol]): Self = this.set("ssrHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrHelpers: Self = this.set("ssrHelpers", js.undefined)
  }
}
