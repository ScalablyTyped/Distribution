package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autoResize: js.UndefOr[Boolean] = js.native
  
  var clickToUse: js.UndefOr[Boolean] = js.native
  
  var configure: js.UndefOr[NetworkConfigure] = js.native
  
  var edges: js.UndefOr[EdgeOptions] = js.native
  
  var groups: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[String] = js.native
  
   // http://visjs.org/docs/network/layout.html
  var interaction: js.UndefOr[js.Any] = js.native
  
  var layout: js.UndefOr[js.Any] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[Locales] = js.native
  
   // visjs.org/docs/network/interaction.html?keywords=edges
  var manipulation: js.UndefOr[js.Any] = js.native
  
  var nodes: js.UndefOr[NodeOptions] = js.native
  
   // http://visjs.org/docs/network/manipulation.html#
  var physics: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setClickToUse(value: Boolean): Self = this.set("clickToUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToUse: Self = this.set("clickToUse", js.undefined)
    
    @scala.inline
    def setConfigure(value: NetworkConfigure): Self = this.set("configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
    
    @scala.inline
    def setEdges(value: EdgeOptions): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Any): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInteraction(value: js.Any): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteraction: Self = this.set("interaction", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocales(value: Locales): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setManipulation(value: js.Any): Self = this.set("manipulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManipulation: Self = this.set("manipulation", js.undefined)
    
    @scala.inline
    def setNodes(value: NodeOptions): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setPhysics(value: js.Any): Self = this.set("physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysics: Self = this.set("physics", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
