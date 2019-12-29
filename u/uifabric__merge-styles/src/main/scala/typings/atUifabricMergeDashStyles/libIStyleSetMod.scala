package typings.atUifabricMergeDashStyles

import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/IStyleSet", JSImport.Namespace)
@js.native
object libIStyleSetMod extends js.Object {
  @js.native
  trait IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunction<any, @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.IStyleSet<any>>}
      */ typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesStrings.IConcatenatedStyleSet with js.Any
      ] = js.native
  }
  
  @js.native
  trait IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.__MapToFunctionType<TStyleSet['subComponentStyles'] extends infer J? P extends keyof any? any[P] : never : never>}
      */ typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesStrings.IProcessedStyleSet with js.Any = js.native
  }
  
  @js.native
  trait IStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunctionOrObject<any, @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.IStyleSet<any>>}
      */ typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesStrings.IStyleSet with js.Any
      ] = js.native
  }
  
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Omit[U, K /* <: String */] = Pick[U, Diff[String, K]]
  type __MapToFunctionType[T] = (Extract[T, js.Function]) | (js.Function1[/* repeated */ js.Any, Partial[T]])
}

