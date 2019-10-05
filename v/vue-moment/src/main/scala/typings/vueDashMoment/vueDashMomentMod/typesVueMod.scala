package typings.vueDashMoment.vueDashMomentMod

import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import typings.vueDashMoment.vueDashMomentMod.VueMomentPlugin.Options
import typings.vueDashMoment.vueDashMomentMod.VueMomentPlugin.VueStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$moment")
    var $moment_Original: VueStatic = js.native
    @JSName("$moment")
    def $moment(): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(options: Options): Unit = js.native
  }
  
}

