package typings.utilPromisify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(fn: js.Function): js.Function = js.native
    def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
    def apply[TCustom /* <: js.Function */](
      fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.CustomPromisify<TCustom> */ js.Any
    ): TCustom = js.native
    def apply[T1](
      fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
    def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
    def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
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
  }
  
  trait Typeofpromisify extends StObject {
    
    /**
      * @deprecated
      * Not exposed by native `util.promisify` or supported by browserify's `util.promisify`.
      *
      * Use `util.promisify.custom` instead.
      */
    val customPromisifyArgs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any
      ] = js.undefined
  }
  object Typeofpromisify {
    
    inline def apply(): Typeofpromisify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Typeofpromisify]
    }
    
    extension [Self <: Typeofpromisify](x: Self) {
      
      inline def setCustomPromisifyArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any
      ): Self = StObject.set(x, "customPromisifyArgs", value.asInstanceOf[js.Any])
      
      inline def setCustomPromisifyArgsUndefined: Self = StObject.set(x, "customPromisifyArgs", js.undefined)
    }
  }
}
