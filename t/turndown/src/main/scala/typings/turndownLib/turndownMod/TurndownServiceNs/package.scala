package typings
package turndownLib.turndownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TurndownServiceNs {
  type Filter = TagName | js.Array[TagName] | FilterFunction
  type FilterFunction = js.Function2[/* node */ stdLib.HTMLElement, /* options */ Options, scala.Boolean]
  type Node = stdLib.HTMLElement | stdLib.Document | stdLib.DocumentFragment
  type Plugin = js.Function1[/* service */ turndownLib.turndownMod.TurndownService, scala.Unit]
  type ReplacementFunction = js.Function3[
    /* content */ java.lang.String, 
    /* node */ Node, 
    /* options */ Options, 
    java.lang.String
  ]
}
