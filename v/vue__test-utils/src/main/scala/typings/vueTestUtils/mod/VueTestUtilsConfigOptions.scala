package typings.vueTestUtils.mod

import typings.std.Record
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTestUtilsConfigOptions extends js.Object {
  
  var deprecationWarningHandler: js.UndefOr[js.Function] = js.native
  
  var methods: Record[String, js.Function] = js.native
  
  var mocks: Record[String, _] = js.native
  
  var provide: js.UndefOr[Record[String, _]] = js.native
  
  var showDeprecationWarnings: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var stubs: Record[
    String, 
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | Boolean | String
  ] = js.native
}
object VueTestUtilsConfigOptions {
  
  @scala.inline
  def apply(
    methods: Record[String, js.Function],
    mocks: Record[String, _],
    stubs: Record[
      String, 
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | Boolean | String
    ]
  ): VueTestUtilsConfigOptions = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], stubs = stubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTestUtilsConfigOptions]
  }
  
  @scala.inline
  implicit class VueTestUtilsConfigOptionsOps[Self <: VueTestUtilsConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setMethods(value: Record[String, js.Function]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMocks(value: Record[String, _]): Self = this.set("mocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStubs(
      value: Record[
          String, 
          (Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | Boolean | String
        ]
    ): Self = this.set("stubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationWarningHandler(value: js.Function): Self = this.set("deprecationWarningHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationWarningHandler: Self = this.set("deprecationWarningHandler", js.undefined)
    
    @scala.inline
    def setProvide(value: Record[String, _]): Self = this.set("provide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvide: Self = this.set("provide", js.undefined)
    
    @scala.inline
    def setShowDeprecationWarnings(value: Boolean): Self = this.set("showDeprecationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeprecationWarnings: Self = this.set("showDeprecationWarnings", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
