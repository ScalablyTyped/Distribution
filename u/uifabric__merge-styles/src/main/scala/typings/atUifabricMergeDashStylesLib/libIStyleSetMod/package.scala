package typings
package atUifabricMergeDashStylesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleSetMod {
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: @uifabric/merge-styles.Anon_X<T, U>[T] */ js.Any
  type IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.Anon_SubComponentStyles[TStyleSet]
  type IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] = atUifabricMergeDashStylesLib.Anon_SubComponentStylesOmit[TStyleSet]
  type IStyleSet[TStyleSet /* <: js.Object */] = atUifabricMergeDashStylesLib.Anon_SubComponentStylesOmitTStyleSet[TStyleSet]
  type Omit[U, K /* <: java.lang.String */] = stdLib.Pick[U, Diff[java.lang.String, K]]
  type __MapToFunctionType[T] = (stdLib.Extract[T, js.Function]) | (js.Function1[/* repeated */ js.Any, stdLib.Partial[T]])
}
