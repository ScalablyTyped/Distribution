package typings.webprogbaseDashConsoleDashView

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webprogbaseDashConsoleDashViewMod {
  type BasicObject[T] = StringDictionary[T]
  type FormFields = BasicObject[String | FormFieldDescriptor]
  type ServerAppHandler = js.Function2[/* req */ Request, /* res */ Response, Unit]
  type StateLinks = BasicObject[String | StateLinkDescriptor]
}
