package typings.xhr

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xhrMod {
  type XhrCallback = js.Function3[/* error */ Error, /* response */ XhrResponse, /* body */ js.Any, Unit]
  type XhrHeaders = StringDictionary[String]
}
