package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generateUrlsMod {
  type GenerateUrl = js.Function2[
    /* routeName */ java.lang.String, 
    /* params */ js.UndefOr[typings.universalRouter.generateUrlsMod.UrlParams], 
    java.lang.String
  ]
  type UrlParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])]
}
