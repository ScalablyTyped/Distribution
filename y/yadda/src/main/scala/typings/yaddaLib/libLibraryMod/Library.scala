package typings
package yaddaLib.libLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Library
  extends yaddaLib.libLocalisationLanguageMod.Library {
  def define(signatures: java.lang.String): this.type = js.native
  def define(signatures: java.lang.String, fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit]): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: java.lang.String,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(signatures: js.Array[stdLib.RegExp | java.lang.String]): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: js.Array[stdLib.RegExp | java.lang.String],
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(signatures: stdLib.RegExp): this.type = js.native
  def define(signatures: stdLib.RegExp, fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit]): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction0[/* this */ yaddaLib.libMod.StepFn, scala.Unit],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction1[
      /* this */ yaddaLib.libMod.StepFn, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg1 */ /* repeated */ java.lang.String), 
      js.Promise[scala.Unit] | scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction2[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg2 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction3[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg3 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction4[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg4 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction5[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg5 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction6[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      (/* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]) | (/* arg6 */ java.lang.String), 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^
  ): this.type = js.native
  def define(
    signatures: stdLib.RegExp,
    fn: js.ThisFunction7[
      /* this */ yaddaLib.libMod.StepFn, 
      /* arg1 */ java.lang.String, 
      /* arg2 */ java.lang.String, 
      /* arg3 */ java.lang.String, 
      /* arg4 */ java.lang.String, 
      /* arg5 */ java.lang.String, 
      /* arg6 */ java.lang.String, 
      /* next */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    macro_context: yaddaLib.libContextMod.^,
    options: yaddaLib.libMacroMod.Options
  ): this.type = js.native
}

