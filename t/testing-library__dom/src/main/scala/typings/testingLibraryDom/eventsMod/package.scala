package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type FireFunction = js.Function2[
    /* element */ typings.std.Document_ | typings.std.Element | typings.std.Window_ | typings.std.Node, 
    /* event */ typings.std.Event_, 
    scala.Boolean
  ]
}
