package typings.yadda

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanishMod extends Shortcut {
  
  @JSImport("yadda/lib/localisation/Spanish", JSImport.Namespace)
  @js.native
  val ^ : typings.yadda.languageMod.^[Library] = js.native
  
  @js.native
  trait Library
    extends StObject
       with typings.yadda.englishMod.Library {
    
    def cuando(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def cuando(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def cuando(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
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
    def cuando(
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
    def cuando(
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
    def cuando(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def cuando(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def cuando(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
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
    def cuando(
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
    def cuando(
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
    def cuando(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def cuando(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def cuando(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def cuando(
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
    def cuando(
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
    def cuando(
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
    
    def dada(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dada(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dada(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
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
    def dada(
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
    def dada(
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
    def dada(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dada(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dada(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
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
    def dada(
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
    def dada(
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
    def dada(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dada(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dada(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dada(
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
    def dada(
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
    def dada(
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
    
    def dadas(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dadas(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dadas(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
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
    def dadas(
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
    def dadas(
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
    def dadas(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dadas(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dadas(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
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
    def dadas(
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
    def dadas(
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
    def dadas(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dadas(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dadas(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dadas(
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
    def dadas(
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
    def dadas(
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
    
    def dado(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dado(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dado(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
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
    def dado(
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
    def dado(
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
    def dado(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dado(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dado(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
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
    def dado(
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
    def dado(
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
    def dado(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dado(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dado(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dado(
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
    def dado(
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
    def dado(
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
    
    def dados(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dados(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dados(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
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
    def dados(
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
    def dados(
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
    def dados(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dados(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dados(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
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
    def dados(
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
    def dados(
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
    def dados(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def dados(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def dados(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def dados(
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
    def dados(
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
    def dados(
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
    
    def entonces(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def entonces(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def entonces(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
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
    def entonces(
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
    def entonces(
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
    def entonces(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def entonces(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def entonces(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
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
    def entonces(
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
    def entonces(
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
    def entonces(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def entonces(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def entonces(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def entonces(
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
    def entonces(
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
    def entonces(
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
    
    def sea(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sea(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sea(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
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
    def sea(
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
    def sea(
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
    def sea(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sea(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sea(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
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
    def sea(
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
    def sea(
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
    def sea(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sea(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sea(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sea(
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
    def sea(
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
    def sea(
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
    
    def sean(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sean(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sean(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
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
    def sean(
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
    def sean(
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
    def sean(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sean(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sean(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
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
    def sean(
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
    def sean(
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
    def sean(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def sean(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def sean(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def sean(
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
    def sean(
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
    def sean(
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
    
    def si(
      step: String,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def si(
      step: String,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def si(
      step: String,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
      step: String,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
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
    def si(
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
    def si(
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
    def si(
      step: js.Array[RegExp | String],
      fn: js.Function1[
          (/* next */ js.Function1[js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def si(
      step: js.Array[RegExp | String],
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def si(
      step: js.Array[RegExp | String],
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
      step: js.Array[RegExp | String],
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
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
    def si(
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
    def si(
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
    def si(
      step: RegExp,
      fn: js.Function1[
          (/* next */ js.Function1[/* err */ js.UndefOr[Error], Unit]) | (/* repeated */ String), 
          js.Promise[Unit] | Unit
        ]
    ): this.type = js.native
    def si(
      step: RegExp,
      fn: js.Function2[/* arg1 */ String, /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
    ): this.type = js.native
    def si(
      step: RegExp,
      fn: js.Function3[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
      step: RegExp,
      fn: js.Function4[
          /* arg1 */ String, 
          /* arg2 */ String, 
          /* arg3 */ String, 
          /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
    ): this.type = js.native
    def si(
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
    def si(
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
    def si(
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
  
  trait Vocabulary
    extends StObject
       with typings.yadda.englishMod.Vocabulary {
    
    var cuando: String
    
    var dada: String
    
    var dadas: String
    
    var dado: String
    
    var dados: String
    
    var entonces: String
    
    var sea: String
    
    var sean: String
    
    var si: String
  }
  object Vocabulary {
    
    inline def apply(
      _steps: js.Array[String],
      background: String,
      cuando: String,
      dada: String,
      dadas: String,
      dado: String,
      dados: String,
      entonces: String,
      examples: String,
      feature: String,
      `given`: String,
      only: String,
      pending: String,
      scenario: String,
      sea: String,
      sean: String,
      si: String,
      `then`: String,
      when: String
    ): Vocabulary = {
      val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], cuando = cuando.asInstanceOf[js.Any], dada = dada.asInstanceOf[js.Any], dadas = dadas.asInstanceOf[js.Any], dado = dado.asInstanceOf[js.Any], dados = dados.asInstanceOf[js.Any], entonces = entonces.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], sean = sean.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("given")(`given`.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vocabulary]
    }
    
    extension [Self <: Vocabulary](x: Self) {
      
      inline def setCuando(value: String): Self = StObject.set(x, "cuando", value.asInstanceOf[js.Any])
      
      inline def setDada(value: String): Self = StObject.set(x, "dada", value.asInstanceOf[js.Any])
      
      inline def setDadas(value: String): Self = StObject.set(x, "dadas", value.asInstanceOf[js.Any])
      
      inline def setDado(value: String): Self = StObject.set(x, "dado", value.asInstanceOf[js.Any])
      
      inline def setDados(value: String): Self = StObject.set(x, "dados", value.asInstanceOf[js.Any])
      
      inline def setEntonces(value: String): Self = StObject.set(x, "entonces", value.asInstanceOf[js.Any])
      
      inline def setSea(value: String): Self = StObject.set(x, "sea", value.asInstanceOf[js.Any])
      
      inline def setSean(value: String): Self = StObject.set(x, "sean", value.asInstanceOf[js.Any])
      
      inline def setSi(value: String): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = typings.yadda.languageMod.^[Library]
  
  /* This means you don't have to write `^`, but can instead just say `spanishMod.foo` */
  override def _to: typings.yadda.languageMod.^[Library] = ^
}
