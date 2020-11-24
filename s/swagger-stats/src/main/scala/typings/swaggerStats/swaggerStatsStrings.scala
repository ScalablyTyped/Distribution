package typings.swaggerStats

import typings.swaggerStats.mod.HTTPMethod
import typings.swaggerStats.mod.HTTPMethodSubset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swaggerStatsStrings {
  
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
  
  @js.native
  sealed trait DELETE
    extends HTTPMethod
       with HTTPMethodSubset
  
  @js.native
  sealed trait GET
    extends HTTPMethod
       with HTTPMethodSubset
  
  @js.native
  sealed trait HEAD extends HTTPMethod
  
  @js.native
  sealed trait OPTIONS extends HTTPMethod
  
  @js.native
  sealed trait PATCH extends HTTPMethod
  
  @js.native
  sealed trait POST
    extends HTTPMethod
       with HTTPMethodSubset
  
  @js.native
  sealed trait PUT
    extends HTTPMethod
       with HTTPMethodSubset
  
  @js.native
  sealed trait TRACE extends HTTPMethod
}
