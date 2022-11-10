package typings.uifabricMergeStyles

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIstylesetMod {
  
  type Diff[T /* <: /* keyof any */ String */, U /* <: /* keyof any */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  @js.native
  trait IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunction<any, any>} */ js.Any
      ] = js.native
  }
  
  @js.native
  trait IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.__MapToFunctionType<TStyleSet['subComponentStyles'] extends infer J? P extends keyof J? J[P] : never : never>} */ js.Any = js.native
  }
  
  @js.native
  trait IStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunctionOrObject<any, any>} */ js.Any
      ] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Extract<T, std.Function> extends never ? (args : ...any): std.Partial<T> : std.Extract<T, std.Function>
    }}}
    */
  type MapToFunctionType[T] = T
  
  type Omit[U, K /* <: /* keyof U */ String */] = Pick[U, Diff[/* keyof U */ String, K]]
}
