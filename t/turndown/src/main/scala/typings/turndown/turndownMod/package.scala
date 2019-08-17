package typings.turndown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object turndownMod {
  import typings.std.Document
  import typings.std.DocumentFragment
  import typings.std.HTMLElement

  type Filter = TagName | js.Array[TagName] | FilterFunction
  type FilterFunction = js.Function2[/* node */ HTMLElement, /* options */ Options, Boolean]
  type Node = HTMLElement | Document | DocumentFragment
  type Plugin = js.Function1[/* service */ TurndownService, Unit]
  type ReplacementFunction = js.Function3[/* content */ String, /* node */ Node, /* options */ Options, String]
}
