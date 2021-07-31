package typings.utilPromisify

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPromisifyMod {
  
  // tslint:disable-next-line: ban-types
  @scala.inline
  def apply(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  // tslint:disable-next-line: ban-types
  @scala.inline
  def apply[TCustom /* <: js.Function */](
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.CustomPromisify<TCustom> */ js.Any
  ): TCustom = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[TCustom]
  @scala.inline
  def apply[T1](
    fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, js.Promise[Unit]]]
  @scala.inline
  def apply[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]]
  @scala.inline
  def apply[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]]
  @scala.inline
  def apply[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]]
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[Unit]
  ]]
  
  @JSImport("util.promisify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof promisify */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfill")().asInstanceOf[ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof promisify */ js.Any
    ]
  ]]
  
  @scala.inline
  def implementation(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def implementation(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  @scala.inline
  def implementation[TCustom /* <: js.Function */](
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.CustomPromisify<TCustom> */ js.Any
  ): TCustom = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[TCustom]
  @scala.inline
  def implementation[T1](
    fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, js.Promise[Unit]]]
  @scala.inline
  def implementation[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]]
  @scala.inline
  def implementation[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]]
  @scala.inline
  def implementation[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]]
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[Unit]
  ]]
  
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[TResult]
  ]]
  
  @scala.inline
  def implementation_T1T2T3T4TResult[T1, T2, T3, T4, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]]
  
  @scala.inline
  def implementation_T1T2T3TResult[T1, T2, T3, TResult](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]]
  
  @scala.inline
  def implementation_T1T2TResult[T1, T2, TResult](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]]
  
  @scala.inline
  def implementation_T1TResult[T1, TResult](
    fn: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ T1, js.Promise[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, js.Promise[TResult]]]
  
  @scala.inline
  def implementation_TResult[TResult](fn: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, Unit], Unit]): js.Function0[js.Promise[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implementation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[TResult]]]
  
  @scala.inline
  def shim(): ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ]]
}
