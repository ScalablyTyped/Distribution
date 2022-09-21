package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.OnPrepare
import typings.vscodeLanguageserver.serverMod.Feature
import typings.vscodeLanguageserver.serverMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeHierarchyMod {
  
  @JSImport("vscode-languageserver/lib/common/typeHierarchy", "TypeHierarchyFeature")
  @js.native
  val TypeHierarchyFeature: Feature[_Languages, TypeHierarchyFeatureShape] = js.native
  
  trait TypeHierarchyFeatureShape extends StObject {
    
    var typeHierarchy: OnPrepare
  }
  object TypeHierarchyFeatureShape {
    
    inline def apply(typeHierarchy: OnPrepare): TypeHierarchyFeatureShape = {
      val __obj = js.Dynamic.literal(typeHierarchy = typeHierarchy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHierarchyFeatureShape]
    }
    
    extension [Self <: TypeHierarchyFeatureShape](x: Self) {
      
      inline def setTypeHierarchy(value: OnPrepare): Self = StObject.set(x, "typeHierarchy", value.asInstanceOf[js.Any])
    }
  }
}
