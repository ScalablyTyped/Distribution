package typings
package yargsDashParserLib.yargsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def apply(argv: java.lang.String): Arguments = js.native
  def apply(argv: java.lang.String, opts: Options): Arguments = js.native
  def apply(argv: js.Array[java.lang.String]): Arguments = js.native
  def apply(argv: js.Array[java.lang.String], opts: Options): Arguments = js.native
  def detailed(argv: java.lang.String): DetailedArguments = js.native
  def detailed(argv: java.lang.String, opts: Options): DetailedArguments = js.native
  def detailed(argv: js.Array[java.lang.String]): DetailedArguments = js.native
  def detailed(argv: js.Array[java.lang.String], opts: Options): DetailedArguments = js.native
}

