package typings.stubby

import typings.stubby.stubbyMod.StubbyMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stubbyStrings {
  @js.native
  sealed trait CONNECT extends StubbyMethod
  
  @js.native
  sealed trait DELETE extends StubbyMethod
  
  @js.native
  sealed trait GET extends StubbyMethod
  
  @js.native
  sealed trait HEAD extends StubbyMethod
  
  @js.native
  sealed trait OPTIONS extends StubbyMethod
  
  @js.native
  sealed trait PATCH extends StubbyMethod
  
  @js.native
  sealed trait POST extends StubbyMethod
  
  @js.native
  sealed trait PUT extends StubbyMethod
  
  @js.native
  sealed trait TRACE extends StubbyMethod
  
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
}

