package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSegment
  extends StObject
     with /* urlSegment */ StringDictionary[
      RouteSegment | (RequestHandler[ParamsDictionary, js.Any, js.Any, Query]) | (js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]])
    ]
object RouteSegment {
  
  @scala.inline
  def apply(): RouteSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSegment]
  }
}
