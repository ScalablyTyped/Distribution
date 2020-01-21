package typings.webprogbaseConsoleView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type FormFields = typings.webprogbaseConsoleView.mod.BasicObject[java.lang.String | typings.webprogbaseConsoleView.mod.FormFieldDescriptor]
  type ServerAppHandler = js.Function2[
    /* req */ typings.webprogbaseConsoleView.mod.Request, 
    /* res */ typings.webprogbaseConsoleView.mod.Response, 
    scala.Unit
  ]
  type StateLinks = typings.webprogbaseConsoleView.mod.BasicObject[java.lang.String | typings.webprogbaseConsoleView.mod.StateLinkDescriptor]
}
