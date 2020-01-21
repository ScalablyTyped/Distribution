package typings.workboxRouting

import typings.workboxRouting.httpmethodMod.HTTPMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workboxRoutingStrings {
  @js.native
  sealed trait DELETE extends HTTPMethod
  
  @js.native
  sealed trait GET extends HTTPMethod
  
  @js.native
  sealed trait HEAD extends HTTPMethod
  
  @js.native
  sealed trait PATCH extends HTTPMethod
  
  @js.native
  sealed trait POST extends HTTPMethod
  
  @js.native
  sealed trait PUT extends HTTPMethod
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
}

