package typings.xhr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xhrMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type XhrCallback = js.Function3[/* error */ Error, /* response */ XhrResponse, /* body */ js.Any, Unit]
  type XhrHeaders = StringDictionary[String]
}
