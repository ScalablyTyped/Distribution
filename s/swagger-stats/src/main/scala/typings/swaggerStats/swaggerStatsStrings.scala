package typings.swaggerStats

import typings.swaggerStats.mod.HTTPMethod
import typings.swaggerStats.mod.HTTPMethodSubset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swaggerStatsStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HTTPMethod
       with HTTPMethodSubset
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HTTPMethod
       with HTTPMethodSubset
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HTTPMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HTTPMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HTTPMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HTTPMethod
       with HTTPMethodSubset
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HTTPMethod
       with HTTPMethodSubset
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HTTPMethod
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
}
