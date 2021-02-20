package typings.utilPromisify

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPromisifyMod {
  
  // tslint:disable-next-line: ban-types
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function): js.Function = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
  // tslint:disable-next-line: ban-types
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[TCustom /* <: js.Function */](
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.CustomPromisify<TCustom> */ js.Any
  ): TCustom = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[T1](
    fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  def apply[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[Unit]
  ] = js.native
  
  @JSImport("util.promisify", "custom")
  @js.native
  val custom: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof util.promisify.custom */ js.Any = js.native
  
  /**
    * @deprecated
    * Not exposed by native `util.promisify` or supported by browserify's `util.promisify`.
    *
    * Use `util.promisify.custom` instead.
    */
  @JSImport("util.promisify", "customPromisifyArgs")
  @js.native
  val customPromisifyArgs: js.UndefOr[js.Symbol] = js.native
  
  @JSImport("util.promisify", "getPolyfill")
  @js.native
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof promisify */ js.Any
    ]
  ] = js.native
  
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation(fn: js.Function): js.Function = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[TCustom /* <: js.Function */](
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.CustomPromisify<TCustom> */ js.Any
  ): TCustom = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[T1](
    fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[Unit]
  ] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[TResult]
  ] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_T1T2T3TResult[T1, T2, T3, TResult](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_T1T2TResult[T1, T2, TResult](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_T1TResult[T1, TResult](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[TResult]] = js.native
  @JSImport("util.promisify", "implementation")
  @js.native
  def implementation_TResult[TResult](fn: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], Unit]): js.Function0[js.Promise[TResult]] = js.native
  
  @JSImport("util.promisify", "shim")
  @js.native
  def shim(): ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ] = js.native
}
