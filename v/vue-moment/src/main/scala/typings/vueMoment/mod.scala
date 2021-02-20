package typings.vueMoment

import org.scalablytyped.runtime.Shortcut
import typings.moment.mod.DurationInputArg1
import typings.moment.mod.DurationInputArg2
import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.vue.pluginMod.PluginObject
import typings.vueMoment.mod.VueMomentPlugin.Options
import typings.vueMoment.mod.VueMomentPlugin.VueStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-moment", JSImport.Namespace)
  @js.native
  val ^ : VueMoment = js.native
  
  type VueMoment = PluginObject[js.UndefOr[scala.Nothing]]
  
  object VueMomentPlugin {
    
    @js.native
    trait Options extends StObject {
      
      // The optional (self-maintained) moment instance
      var moment: js.UndefOr[Moment] = js.native
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
        def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
      }
    }
    
    @js.native
    trait VueStatic extends Moment {
      
      def apply(): Moment = js.native
      def apply(
        inp: js.UndefOr[MomentInput],
        format: js.UndefOr[MomentFormatSpecification],
        language: js.UndefOr[scala.Nothing],
        strict: Boolean
      ): Moment = js.native
      def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
      def apply(
        inp: js.UndefOr[MomentInput],
        format: js.UndefOr[MomentFormatSpecification],
        language: String,
        strict: Boolean
      ): Moment = js.native
      def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
      def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
      def apply(inp: MomentInput): Moment = js.native
      def apply(options: Options): Unit = js.native
      
      def duration(): Duration_ = js.native
      def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
      def duration(inp: DurationInputArg1): Duration_ = js.native
    }
  }
  
  type _To = VueMoment
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueMoment = ^
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
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
      @JSName("$moment")
      var $moment_Original: VueStatic = js.native
    }
  }
}
