package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  var clickToUse: js.UndefOr[Boolean] = js.undefined
  
  var configure: js.UndefOr[NetworkConfigure] = js.undefined
  
  var edges: js.UndefOr[EdgeOptions] = js.undefined
  
  var groups: js.UndefOr[js.Any] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  // http://visjs.org/docs/network/layout.html
  var interaction: js.UndefOr[js.Any] = js.undefined
  
  var layout: js.UndefOr[js.Any] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[Locales] = js.undefined
  
  // visjs.org/docs/network/interaction.html?keywords=edges
  var manipulation: js.UndefOr[js.Any] = js.undefined
  
  var nodes: js.UndefOr[NodeOptions] = js.undefined
  
  // http://visjs.org/docs/network/manipulation.html#
  var physics: js.UndefOr[js.Any] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setClickToUse(value: Boolean): Self = StObject.set(x, "clickToUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToUseUndefined: Self = StObject.set(x, "clickToUse", js.undefined)
    
    @scala.inline
    def setConfigure(value: NetworkConfigure): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    @scala.inline
    def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Any): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInteraction(value: js.Any): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setManipulation(value: js.Any): Self = StObject.set(x, "manipulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManipulationUndefined: Self = StObject.set(x, "manipulation", js.undefined)
    
    @scala.inline
    def setNodes(value: NodeOptions): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setPhysics(value: js.Any): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
