package typings.twemoji.twemojiMod

import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twemoji", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val base: String = js.native
  val className: String = js.native
  val ext: String = js.native
  val size: String = js.native
  def onerror(): Unit = js.native
  def parse(what: String): String = js.native
  def parse(what: String, how: Partial[ParseObject]): String = js.native
  def parse(what: String, how: ParseCallback): String = js.native
  def parse(what: HTMLElement): String = js.native
  def parse(what: HTMLElement, how: Partial[ParseObject]): String = js.native
  def parse(what: HTMLElement, how: ParseCallback): String = js.native
  def replace(text: String, callback: js.Function0[Unit]): String = js.native
  def test(text: String): Boolean = js.native
}

