package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  var clickToUse: js.UndefOr[Boolean] = js.undefined
  
  var configure: js.UndefOr[NetworkConfigure] = js.undefined
  
  var edges: js.UndefOr[EdgeOptions] = js.undefined
  
  var groups: js.UndefOr[Any] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  // http://visjs.org/docs/network/layout.html
  var interaction: js.UndefOr[Any] = js.undefined
  
  var layout: js.UndefOr[Any] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[Locales] = js.undefined
  
  // visjs.org/docs/network/interaction.html?keywords=edges
  var manipulation: js.UndefOr[Any] = js.undefined
  
  var nodes: js.UndefOr[NodeOptions] = js.undefined
  
  // http://visjs.org/docs/network/manipulation.html#
  var physics: js.UndefOr[Any] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setClickToUse(value: Boolean): Self = StObject.set(x, "clickToUse", value.asInstanceOf[js.Any])
    
    inline def setClickToUseUndefined: Self = StObject.set(x, "clickToUse", js.undefined)
    
    inline def setConfigure(value: NetworkConfigure): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setGroups(value: Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInteraction(value: Any): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setManipulation(value: Any): Self = StObject.set(x, "manipulation", value.asInstanceOf[js.Any])
    
    inline def setManipulationUndefined: Self = StObject.set(x, "manipulation", js.undefined)
    
    inline def setNodes(value: NodeOptions): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setPhysics(value: Any): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
