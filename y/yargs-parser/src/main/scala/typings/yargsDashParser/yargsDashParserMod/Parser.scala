package typings.yargsDashParser.yargsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def apply(argv: String): Arguments = js.native
  def apply(argv: String, opts: Options): Arguments = js.native
  def apply(argv: js.Array[String]): Arguments = js.native
  def apply(argv: js.Array[String], opts: Options): Arguments = js.native
  def detailed(argv: String): DetailedArguments = js.native
  def detailed(argv: String, opts: Options): DetailedArguments = js.native
  def detailed(argv: js.Array[String]): DetailedArguments = js.native
  def detailed(argv: js.Array[String], opts: Options): DetailedArguments = js.native
}

