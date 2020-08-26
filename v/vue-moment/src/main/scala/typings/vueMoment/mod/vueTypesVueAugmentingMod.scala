package typings.vueMoment.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.vueMoment.mod.VueMomentPlugin.Options
import typings.vueMoment.mod.VueMomentPlugin.VueStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$moment")
    var $moment_Original: VueStatic = js.native
    @JSName("$moment")
    def $moment(): Moment = js.native
    @JSName("$moment")
    def $moment(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: js.UndefOr[scala.Nothing],
      strict: Boolean
    ): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
    @JSName("$moment")
    def $moment(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: String,
      strict: Boolean
    ): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput): Moment = js.native
    @JSName("$moment")
    def $moment(options: Options): Unit = js.native
  }
  
}

