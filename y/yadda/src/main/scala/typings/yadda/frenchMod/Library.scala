package typings.yadda.frenchMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Library
  extends typings.yadda.englishMod.Library {
  def alors(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: String,
    fn: js.Function7[
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
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def alors(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def alors(
    step: RegExp,
    fn: js.Function7[
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
  def etantdonnalors(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: String,
    fn: js.Function7[
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
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def etantdonnalors(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalors(
    step: RegExp,
    fn: js.Function7[
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
  def etantdonnalorss(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: String,
    fn: js.Function7[
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
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonnalorss(
    step: RegExp,
    fn: js.Function7[
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
  def etantdonne(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: String,
    fn: js.Function7[
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
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def etantdonne(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def etantdonne(
    step: RegExp,
    fn: js.Function7[
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
  def lorsque(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: String,
    fn: js.Function7[
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
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def lorsque(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def lorsque(
    step: RegExp,
    fn: js.Function7[
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
  def quand(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: String,
    fn: js.Function7[
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
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def quand(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def quand(
    step: RegExp,
    fn: js.Function7[
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
  def soit(
    step: String,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: String,
    fn: js.Function7[
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
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function1[
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: js.Array[RegExp | String],
    fn: js.Function7[
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
  def soit(
    step: RegExp,
    fn: js.Function1[
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function3[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function4[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function5[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function6[
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ]
  ): this.type = js.native
  def soit(
    step: RegExp,
    fn: js.Function7[
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

