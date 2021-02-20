package typings.yadda

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.std.RegExp
import typings.yadda.libMod.StepFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object englishMod extends Shortcut {
  
  @JSImport("yadda/lib/localisation/English", JSImport.Namespace)
  @js.native
  val ^ : typings.yadda.languageMod.^[Library] = js.native
  
  @js.native
  trait Library
    extends typings.yadda.languageMod.Library {
    
    def given(step: String): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: String,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(step: js.Array[RegExp | String]): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(step: RegExp): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def given(
      step: RegExp,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    
    def `then`(step: String): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: String,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(step: js.Array[RegExp | String]): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(step: RegExp): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def `then`(
      step: RegExp,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    
    def when(step: String): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: String,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(step: js.Array[RegExp | String]): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: js.Array[RegExp | String],
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(step: RegExp): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction1[
          /* this */ StepFn, 
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction2[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction3[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction4[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction5[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction6[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def when(
      step: RegExp,
      fn: js.ThisFunction7[
          /* this */ StepFn, 
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* arg4 */ String, 
          /* arg5 */ String, 
          /* arg6 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Vocabulary
    extends typings.yadda.languageMod.Vocabulary {
    
    var background: String = js.native
    
    var examples: String = js.native
    
    var feature: String = js.native
    
    var given: String = js.native
    
    var only: String = js.native
    
    var pending: String = js.native
    
    var scenario: String = js.native
    
    var `then`: String = js.native
    
    var when: String = js.native
  }
  object Vocabulary {
    
    @scala.inline
    def apply(
      _steps: js.Array[String],
      background: String,
      examples: String,
      feature: String,
      given: String,
      only: String,
      pending: String,
      scenario: String,
      `then`: String,
      when: String
    ): Vocabulary = {
      val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vocabulary]
    }
    
    @scala.inline
    implicit class VocabularyMutableBuilder[Self <: Vocabulary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamples(value: String): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGiven(value: String): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnly(value: String): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenario(value: String): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThen(value: String): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = typings.yadda.languageMod.^[Library]
  
  /* This means you don't have to write `^`, but can instead just say `englishMod.foo` */
  override def _to: typings.yadda.languageMod.^[Library] = ^
}
