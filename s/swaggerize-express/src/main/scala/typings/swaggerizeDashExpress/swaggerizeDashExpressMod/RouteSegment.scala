package typings.swaggerizeDashExpress.swaggerizeDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
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
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteSegment]
  }
}

