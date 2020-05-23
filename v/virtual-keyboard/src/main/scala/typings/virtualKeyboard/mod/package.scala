package typings.virtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomLayout = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type kbEventHandler = js.Function3[
    /* event */ js.UndefOr[typings.std.Event | java.lang.String], 
    /* keyboard */ js.UndefOr[typings.std.Element], 
    /* el */ js.UndefOr[typings.std.Element], 
    scala.Unit
  ]
}
