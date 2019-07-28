package typings.twitter

import org.scalablytyped.runtime.StringDictionary
import typings.request.requestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterMod {
  type Callback = js.Function3[/* error */ js.Any, /* data */ ResponseData, /* response */ Response, Unit]
  type ResponseData = StringDictionary[js.Any]
}
