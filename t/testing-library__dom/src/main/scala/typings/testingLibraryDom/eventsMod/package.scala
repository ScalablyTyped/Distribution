package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type FireFunction = js.Function2[
    /* element */ typings.std.Document | typings.std.Element | typings.std.Window | typings.std.Node, 
    /* event */ typings.std.Event, 
    scala.Boolean
  ]
}
