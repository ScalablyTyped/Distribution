package typings.atUifabricMergeDashStyles

import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleFunctionMod {
  type IStyleFunction[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function1[/* props */ TStylesProps, Partial[TStyleSet]]
  type IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStyleFunction[TStylesProps, TStyleSet]) | Partial[TStyleSet]
}
