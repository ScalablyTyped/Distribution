package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSegment
  extends /* urlSegment */ StringDictionary[
      RouteSegment | (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
    ]

object RouteSegment {
  @scala.inline
  def apply(
    StringDictionary: /* urlSegment */ StringDictionary[
      RouteSegment | (RequestHandler[ParamsDictionary, _, _, Query]) | (js.Array[RequestHandler[ParamsDictionary, _, _, Query]])
    ] = null
  ): RouteSegment = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteSegment]
  }
}

