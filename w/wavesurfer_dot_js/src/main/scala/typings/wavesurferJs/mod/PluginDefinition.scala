package typings.wavesurferJs.mod

import typings.wavesurferJs.anon.InstantiableWaveSurferPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginDefinition extends js.Object {
  var deferInit: js.UndefOr[Boolean] = js.native
  var instance: InstantiableWaveSurferPlugin = js.native
  var name: String = js.native
  var params: js.Object = js.native
  var staticProps: js.UndefOr[js.Object] = js.native
}

object PluginDefinition {
  @scala.inline
  def apply(instance: InstantiableWaveSurferPlugin, name: String, params: js.Object): PluginDefinition = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginDefinition]
  }
  @scala.inline
  implicit class PluginDefinitionOps[Self <: PluginDefinition] (val x: Self) extends AnyVal {
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
    def setInstance(value: InstantiableWaveSurferPlugin): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeferInit(value: Boolean): Self = this.set("deferInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferInit: Self = this.set("deferInit", js.undefined)
    @scala.inline
    def setStaticProps(value: js.Object): Self = this.set("staticProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticProps: Self = this.set("staticProps", js.undefined)
  }
  
}

