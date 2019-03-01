package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of key/value pairs that you can attach to an object. It can be useful for storing
  * additional information about the object in a structured format.
  */
trait IMetadata
  extends /* x */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object IMetadata {
  @scala.inline
  def apply(StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): IMetadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMetadata]
  }
}

