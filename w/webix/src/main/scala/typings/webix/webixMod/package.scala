package typings.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webixMod {
  import org.scalablytyped.runtime.StringDictionary

  type EventHash = StringDictionary[WebixCallback]
  type WebixCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type WebixTemplate = js.Function1[/* repeated */ js.Any, String]
}
