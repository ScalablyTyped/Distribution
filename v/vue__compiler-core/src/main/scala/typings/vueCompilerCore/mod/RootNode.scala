package typings.vueCompilerCore.mod

import typings.std.Set
import typings.vueCompilerCore.vueCompilerCoreInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootNode
  extends StObject
     with Node
     with ParentNode {
  
  var cached: Double
  
  var children: js.Array[TemplateChildNode]
  
  var codegenNode: js.UndefOr[TemplateChildNode | JSChildNode | BlockStatement] = js.undefined
  
  var components: js.Array[String]
  
  var directives: js.Array[String]
  
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var helpers: Set[js.Symbol]
  
  var hoists: js.Array[JSChildNode | Null]
  
  var imports: js.Array[ImportItem]
  
  var ssrHelpers: js.UndefOr[js.Array[js.Symbol]] = js.undefined
  
  var temps: Double
  
  @JSName("type")
  var type_RootNode: `0`
}
object RootNode {
  
  inline def apply(
    cached: Double,
    children: js.Array[TemplateChildNode],
    components: js.Array[String],
    directives: js.Array[String],
    helpers: Set[js.Symbol],
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
  implicit open class MutableBuilder[Self <: RootNode] (val x: Self) extends AnyVal {
    
    inline def setCached(value: Double): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCodegenNode(value: TemplateChildNode | JSChildNode | BlockStatement): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDirectives(value: js.Array[String]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: String*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setHelpers(value: Set[js.Symbol]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHoists(value: js.Array[JSChildNode | Null]): Self = StObject.set(x, "hoists", value.asInstanceOf[js.Any])
    
    inline def setHoistsVarargs(value: (JSChildNode | Null)*): Self = StObject.set(x, "hoists", js.Array(value*))
    
    inline def setImports(value: js.Array[ImportItem]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: ImportItem*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setSsrHelpers(value: js.Array[js.Symbol]): Self = StObject.set(x, "ssrHelpers", value.asInstanceOf[js.Any])
    
    inline def setSsrHelpersUndefined: Self = StObject.set(x, "ssrHelpers", js.undefined)
    
    inline def setSsrHelpersVarargs(value: js.Symbol*): Self = StObject.set(x, "ssrHelpers", js.Array(value*))
    
    inline def setTemps(value: Double): Self = StObject.set(x, "temps", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
