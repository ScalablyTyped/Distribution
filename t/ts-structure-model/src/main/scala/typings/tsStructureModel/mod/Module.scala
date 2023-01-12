package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var aliases: js.Array[AliasNode]
  
  var classes: js.Array[ClassModel]
  
  var enumDeclarations: js.Array[EnumDeclaration]
  
  var imports: StringDictionary[Module]
  
  var name: String
}
object Module {
  
  inline def apply(
    aliases: js.Array[AliasNode],
    classes: js.Array[ClassModel],
    enumDeclarations: js.Array[EnumDeclaration],
    imports: StringDictionary[Module],
    name: String
  ): Module = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], enumDeclarations = enumDeclarations.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[AliasNode]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: AliasNode*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setClasses(value: js.Array[ClassModel]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: ClassModel*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setEnumDeclarations(value: js.Array[EnumDeclaration]): Self = StObject.set(x, "enumDeclarations", value.asInstanceOf[js.Any])
    
    inline def setEnumDeclarationsVarargs(value: EnumDeclaration*): Self = StObject.set(x, "enumDeclarations", js.Array(value*))
    
    inline def setImports(value: StringDictionary[Module]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
