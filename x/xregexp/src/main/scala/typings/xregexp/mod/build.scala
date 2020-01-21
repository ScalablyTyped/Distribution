package typings.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "build")
@js.native
object build extends js.Object {
  def apply(pattern: String, subs: js.Array[String]): RegExp = js.native
  def apply(pattern: String, subs: js.Array[String], flags: String): RegExp = js.native
  def apply(pattern: String, subs: StringDictionary[RegExp]): RegExp = js.native
  def apply(pattern: String, subs: StringDictionary[RegExp], flags: String): RegExp = js.native
}

