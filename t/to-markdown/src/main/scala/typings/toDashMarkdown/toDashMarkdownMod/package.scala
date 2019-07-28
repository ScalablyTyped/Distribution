package typings.toDashMarkdown

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toDashMarkdownMod {
  type Filter = String | js.Array[String] | (js.Function1[/* node */ HTMLElement, Boolean])
}
