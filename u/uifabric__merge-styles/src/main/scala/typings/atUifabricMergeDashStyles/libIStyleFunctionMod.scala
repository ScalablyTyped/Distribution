package typings.atUifabricMergeDashStyles

import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/IStyleFunction", JSImport.Namespace)
@js.native
object libIStyleFunctionMod extends js.Object {
  type IStyleFunction[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function1[/* props */ TStylesProps, Partial[TStyleSet]]
  type IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStyleFunction[TStylesProps, TStyleSet]) | Partial[TStyleSet]
}

