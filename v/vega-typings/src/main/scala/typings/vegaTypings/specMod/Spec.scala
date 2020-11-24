package typings.vegaTypings.specMod

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.scopeMod.Scope
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec
  extends Scope
     with Encodable[EncodeEntry] {
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  
  var autosize: js.UndefOr[AutoSize | SignalRef] = js.native
  
  var background: js.UndefOr[Color | SignalRef] = js.native
  
  var config: js.UndefOr[Config] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | SignalRef] = js.native
  
  var padding: js.UndefOr[Padding | SignalRef] = js.native
  
  var style: js.UndefOr[String | js.Array[String]] = js.native
  
  var width: js.UndefOr[Double | SignalRef] = js.native
}
object Spec {
  
  @scala.inline
  def apply(): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
    
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
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    
    @scala.inline
    def setAutosize(value: AutoSize | SignalRef): Self = this.set("autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosize: Self = this.set("autosize", js.undefined)
    
    @scala.inline
    def setBackground(value: Color | SignalRef): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setConfig(value: Config): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | SignalRef): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | SignalRef): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
