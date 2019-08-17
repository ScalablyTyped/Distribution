package typings.atUifabricMergeDashStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleSetMod {
  import typings.std.Extract
  import typings.std.Partial
  import typings.std.Pick

  type Diff[T /* <: String */, U /* <: String */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Omit[U, K /* <: String */] = Pick[U, Diff[String, K]]
  type __MapToFunctionType[T] = (Extract[T, js.Function]) | (js.Function1[/* repeated */ js.Any, Partial[T]])
}
