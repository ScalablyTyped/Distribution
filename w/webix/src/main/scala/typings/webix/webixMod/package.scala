package typings.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webixMod {
  type EventHash = StringDictionary[WebixCallback]
  type WebixCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type WebixTemplate = js.Function1[/* repeated */ js.Any, String]
}
