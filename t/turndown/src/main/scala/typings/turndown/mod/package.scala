package typings.turndown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter = typings.turndown.mod.TagName | js.Array[typings.turndown.mod.TagName] | typings.turndown.mod.FilterFunction
  type FilterFunction = js.Function2[
    /* node */ typings.std.HTMLElement, 
    /* options */ typings.turndown.mod.Options, 
    scala.Boolean
  ]
  type Node = typings.std.HTMLElement | typings.std.Document | typings.std.DocumentFragment
  type Plugin = js.Function1[/* service */ typings.turndown.mod.TurndownService, scala.Unit]
  type ReplacementFunction = js.Function3[
    /* content */ java.lang.String, 
    /* node */ typings.turndown.mod.Node, 
    /* options */ typings.turndown.mod.Options, 
    java.lang.String
  ]
}
