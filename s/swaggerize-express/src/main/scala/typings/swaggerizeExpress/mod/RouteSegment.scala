package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSegment
  extends /* urlSegment */ StringDictionary[
      RouteSegment | RequestHandler[ParamsDictionary] | js.Array[RequestHandler[ParamsDictionary]]
    ]

object RouteSegment {
  @scala.inline
  def apply(
    StringDictionary: /* urlSegment */ StringDictionary[
      RouteSegment | RequestHandler[ParamsDictionary] | js.Array[RequestHandler[ParamsDictionary]]
    ] = null
  ): RouteSegment = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteSegment]
  }
}

