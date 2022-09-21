package typings.vueMoment

import org.scalablytyped.runtime.Shortcut
import typings.moment.mod.DurationInputArg1
import typings.moment.mod.DurationInputArg2
import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.vueMoment.mod.VueMomentPlugin.Options
import typings.vueMoment.mod.VueMomentPlugin.VueStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-moment", JSImport.Namespace)
  @js.native
  val ^ : VueMoment = js.native
  
  type VueMoment = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<undefined> */ Any
  
  object VueMomentPlugin {
    
    trait Options extends StObject {
      
      // The optional (self-maintained) moment instance
      var moment: js.UndefOr[Moment] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
        
        inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
      }
    }
    
    @js.native
    trait VueStatic
      extends StObject
         with Moment {
      
      def apply(): Moment = js.native
      def apply(inp: Unit, format: Unit, language: String): Moment = js.native
      def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
      def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
      def apply(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
      def apply(inp: Unit, format: MomentFormatSpecification): Moment = js.native
      def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
      def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
      def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
      def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput): Moment = js.native
      def apply(inp: MomentInput, format: Unit, language: String): Moment = js.native
      def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
      def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
      def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
      def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
      def apply(options: Options): Unit = js.native
      
      def duration(): Duration_ = js.native
      def duration(inp: Unit, unit: DurationInputArg2): Duration_ = js.native
      def duration(inp: DurationInputArg1): Duration_ = js.native
      def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration_ = js.native
    }
  }
  
  type _To = VueMoment
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueMoment = ^
  
  object vueTypesVueAugmentingMod {
    
    trait Vue extends StObject {
      
      @JSName("$moment")
      def $moment(): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: Unit, language: String): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: Unit, language: String, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: MomentFormatSpecification): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: MomentFormatSpecification, language: String): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: Unit, language: String): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: MomentFormatSpecification): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment
      @JSName("$moment")
      def $moment(options: Options): Unit
      @JSName("$moment")
      var $moment_Original: VueStatic
    }
    object Vue {
      
      inline def apply($moment: VueStatic): Vue = {
        val __obj = js.Dynamic.literal($moment = $moment.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vue]
      }
      
      extension [Self <: Vue](x: Self) {
        
        inline def set$moment(value: VueStatic): Self = StObject.set(x, "$moment", value.asInstanceOf[js.Any])
      }
    }
  }
}
