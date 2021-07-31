package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootNode
  extends StObject
     with Node2
     with ParentNode2 {
  
  var cached: Double
  
  var children: js.Array[TemplateChildNode]
  
  var codegenNode: js.UndefOr[TemplateChildNode | JSChildNode | BlockStatement] = js.undefined
  
  var components: js.Array[String]
  
  var directives: js.Array[String]
  
  var helpers: js.Array[js.Symbol]
  
  var hoists: js.Array[JSChildNode | Null]
  
  var imports: js.Array[ImportItem]
  
  var ssrHelpers: js.UndefOr[js.Array[js.Symbol]] = js.undefined
  
  var temps: Double
  
  @JSName("type")
  var type_RootNode: `0`
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
    temps: Double
  ): RootNode = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], hoists = hoists.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[RootNode]
  }
  
  @scala.inline
  implicit class RootNodeMutableBuilder[Self <: RootNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCached(value: Double): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCodegenNode(value: TemplateChildNode | JSChildNode | BlockStatement): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[String]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: String*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setHelpers(value: js.Array[js.Symbol]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpersVarargs(value: js.Symbol*): Self = StObject.set(x, "helpers", js.Array(value :_*))
    
    @scala.inline
    def setHoists(value: js.Array[JSChildNode | Null]): Self = StObject.set(x, "hoists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoistsVarargs(value: (JSChildNode | Null)*): Self = StObject.set(x, "hoists", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[ImportItem]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: ImportItem*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setSsrHelpers(value: js.Array[js.Symbol]): Self = StObject.set(x, "ssrHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrHelpersUndefined: Self = StObject.set(x, "ssrHelpers", js.undefined)
    
    @scala.inline
    def setSsrHelpersVarargs(value: js.Symbol*): Self = StObject.set(x, "ssrHelpers", js.Array(value :_*))
    
    @scala.inline
    def setTemps(value: Double): Self = StObject.set(x, "temps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
