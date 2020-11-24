package typings.tuyaPanelKit.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathConfig extends js.Object {
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var initialRouteName: js.UndefOr[String] = js.native
  
  var parse: js.UndefOr[Record[String, js.Function1[/* value */ String, _]]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var screens: js.UndefOr[PathConfigMap] = js.native
  
  var stringify: js.UndefOr[Record[String, js.Function1[/* value */ _, String]]] = js.native
}
object PathConfig {
  
  @scala.inline
  def apply(): PathConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathConfig]
  }
  
  @scala.inline
  implicit class PathConfigOps[Self <: PathConfig] (val x: Self) extends AnyVal {
    
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    
    @scala.inline
    def setParse(value: Record[String, js.Function1[/* value */ String, _]]): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setScreens(value: PathConfigMap): Self = this.set("screens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreens: Self = this.set("screens", js.undefined)
    
    @scala.inline
    def setStringify(value: Record[String, js.Function1[/* value */ _, String]]): Self = this.set("stringify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
}
