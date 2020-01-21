package typings.yadda.englishMod

import typings.std.Error
import typings.std.RegExp
import typings.yadda.libMod.StepFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

