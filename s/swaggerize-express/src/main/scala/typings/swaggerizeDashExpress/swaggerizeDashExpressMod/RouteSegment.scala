package typings.swaggerizeDashExpress.swaggerizeDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSegment
  extends /* urlSegment */ StringDictionary[RouteSegment | RequestHandler | js.Array[RequestHandler]]

object RouteSegment {
  @scala.inline
  def apply(
    StringDictionary: /* urlSegment */ StringDictionary[RouteSegment | RequestHandler | js.Array[RequestHandler]] = null
  ): RouteSegment = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RouteSegment]
  }
}

