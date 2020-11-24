package typings.yadda.libraryMod

import typings.std.Error
import typings.std.RegExp
import typings.yadda.libMod.StepFn
import typings.yadda.macroMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library
  extends typings.yadda.languageMod.Library {
  
  def define(signatures: String): this.type = js.native
  def define(
    signatures: String,
    fn: js.UndefOr[scala.Nothing],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(signatures: String, fn: js.UndefOr[scala.Nothing], macro_context: typings.yadda.contextMod.^): this.type = js.native
  def define(
    signatures: String,
    fn: js.UndefOr[scala.Nothing],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(signatures: String, fn: js.ThisFunction0[/* this */ StepFn, Unit]): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
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
  def define(
    signatures: String,
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
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: String,
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
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: String,
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
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(signatures: js.Array[RegExp | String]): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.UndefOr[scala.Nothing],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.UndefOr[scala.Nothing],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.UndefOr[scala.Nothing],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(signatures: js.Array[RegExp | String], fn: js.ThisFunction0[/* this */ StepFn, Unit]): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
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
  def define(
    signatures: js.Array[RegExp | String],
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
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
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
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[RegExp | String],
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
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(signatures: RegExp): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.UndefOr[scala.Nothing],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(signatures: RegExp, fn: js.UndefOr[scala.Nothing], macro_context: typings.yadda.contextMod.^): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.UndefOr[scala.Nothing],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(signatures: RegExp, fn: js.ThisFunction0[/* this */ StepFn, Unit]): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction0[/* this */ StepFn, Unit],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction1[
      /* this */ StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg1 */ /* repeated */ String), 
      js.Promise[Unit] | Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction2[
      /* this */ StepFn, 
      /* arg1 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg2 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction3[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg3 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction4[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg4 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction5[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg5 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ]
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
    fn: js.ThisFunction6[
      /* this */ StepFn, 
      /* arg1 */ String, 
      /* arg2 */ String, 
      /* arg3 */ String, 
      /* arg4 */ String, 
      /* arg5 */ String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* arg6 */ String), 
      Unit
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
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
  def define(
    signatures: RegExp,
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
    ],
    macro_context: js.UndefOr[scala.Nothing],
    options: Options
  ): this.type = js.native
  def define(
    signatures: RegExp,
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
    ],
    macro_context: typings.yadda.contextMod.^
  ): this.type = js.native
  def define(
    signatures: RegExp,
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
    ],
    macro_context: typings.yadda.contextMod.^,
    options: Options
  ): this.type = js.native
}
