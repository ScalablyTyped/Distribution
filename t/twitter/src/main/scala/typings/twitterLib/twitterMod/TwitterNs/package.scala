package typings
package twitterLib.twitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TwitterNs {
  type Callback = js.Function3[
    /* error */ js.Any, 
    /* data */ ResponseData, 
    /* response */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
}
