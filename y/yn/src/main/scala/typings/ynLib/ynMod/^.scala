package typings
package ynLib.ynMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: js.Any): scala.Boolean | scala.Null = js.native
  def apply(input: js.Any, options: ynLib.ynMod.ynNs.Options): scala.Boolean | scala.Null = js.native
  /**
    * Parse yes/no like values. Useful for validating answers of a CLI prompt.
    *
    * @param input Value that should be converted. The following case-insensitive values are recognized:
    * `'y'`, `'yes'`, `'true'`, `true`, `'1'`, `1`, `'n'`, `'no'`, `'false'`, `false`, `'0'`, `0`
    * @param options
    */
  def apply(input: js.Any, options: ynLib.ynMod.ynNs.OptionsWithDefault): scala.Boolean = js.native
}

