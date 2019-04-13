package typings
package twitterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterMod {
  type Callback = js.Function3[
    /* error */ js.Any, 
    /* data */ ResponseData, 
    /* response */ requestLib.requestMod.Response, 
    scala.Unit
  ]
  type ResponseData = org.scalablytyped.runtime.StringDictionary[js.Any]
}
