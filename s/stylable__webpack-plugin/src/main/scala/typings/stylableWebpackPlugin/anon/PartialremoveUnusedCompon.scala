package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  removeUnusedComponents :boolean,   removeComments :boolean,   removeStylableDirectives :boolean,   classNameOptimizations :boolean,   shortNamespaces :boolean,   removeEmptyNodes :boolean,   minify :boolean}> */
trait PartialremoveUnusedCompon extends StObject {
  
  var classNameOptimizations: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var removeComments: js.UndefOr[Boolean] = js.undefined
  
  var removeEmptyNodes: js.UndefOr[Boolean] = js.undefined
  
  var removeStylableDirectives: js.UndefOr[Boolean] = js.undefined
  
  var removeUnusedComponents: js.UndefOr[Boolean] = js.undefined
  
  var shortNamespaces: js.UndefOr[Boolean] = js.undefined
}
object PartialremoveUnusedCompon {
  
  inline def apply(): PartialremoveUnusedCompon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialremoveUnusedCompon]
  }
  
  extension [Self <: PartialremoveUnusedCompon](x: Self) {
    
    inline def setClassNameOptimizations(value: Boolean): Self = StObject.set(x, "classNameOptimizations", value.asInstanceOf[js.Any])
    
    inline def setClassNameOptimizationsUndefined: Self = StObject.set(x, "classNameOptimizations", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
    
    inline def setRemoveEmptyNodes(value: Boolean): Self = StObject.set(x, "removeEmptyNodes", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyNodesUndefined: Self = StObject.set(x, "removeEmptyNodes", js.undefined)
    
    inline def setRemoveStylableDirectives(value: Boolean): Self = StObject.set(x, "removeStylableDirectives", value.asInstanceOf[js.Any])
    
    inline def setRemoveStylableDirectivesUndefined: Self = StObject.set(x, "removeStylableDirectives", js.undefined)
    
    inline def setRemoveUnusedComponents(value: Boolean): Self = StObject.set(x, "removeUnusedComponents", value.asInstanceOf[js.Any])
    
    inline def setRemoveUnusedComponentsUndefined: Self = StObject.set(x, "removeUnusedComponents", js.undefined)
    
    inline def setShortNamespaces(value: Boolean): Self = StObject.set(x, "shortNamespaces", value.asInstanceOf[js.Any])
    
    inline def setShortNamespacesUndefined: Self = StObject.set(x, "shortNamespaces", js.undefined)
  }
}
