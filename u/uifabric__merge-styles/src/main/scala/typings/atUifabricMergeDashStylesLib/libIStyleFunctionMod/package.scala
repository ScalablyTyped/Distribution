package typings
package atUifabricMergeDashStylesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIStyleFunctionMod {
  type IStyleFunction[TStylesProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */] = js.Function1[/* props */ TStylesProps, stdLib.Partial[TStyleSet]]
  type IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */] = (IStyleFunction[TStylesProps, TStyleSet]) | stdLib.Partial[TStyleSet]
}
