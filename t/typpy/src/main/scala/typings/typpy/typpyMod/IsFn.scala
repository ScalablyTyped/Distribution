package typings.typpy.typpyMod

import typings.std.RegExp
import typings.typpy.typpyStrings.array
import typings.typpy.typpyStrings.boolean
import typings.typpy.typpyStrings.function
import typings.typpy.typpyStrings.nan
import typings.typpy.typpyStrings.number
import typings.typpy.typpyStrings.regexp
import typings.typpy.typpyStrings.string
import typings.typpy.typpyStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFn extends js.Object {
  def apply(): undefined = js.native
  def apply(input: String): string = js.native
  def apply(input: js.Any): String = js.native
  def apply(input: js.Array[_]): array = js.native
  def apply(input: js.Function): function = js.native
  def apply(input: Boolean): boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double): number | nan = js.native
  def apply(input: RegExp): regexp = js.native
}

