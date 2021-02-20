package typings.wpapi

import typings.wpapi.mod.HTTPArgumentType
import typings.wpapi.mod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wpapiStrings {
  
  @js.native
  sealed trait DELETE extends HTTPMethod
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends HTTPMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait PATCH extends HTTPMethod
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST extends HTTPMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends HTTPMethod
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait array extends HTTPArgumentType
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait asc extends StObject
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait boolean extends HTTPArgumentType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait desc extends StObject
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait integer extends HTTPArgumentType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait number extends HTTPArgumentType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object` extends HTTPArgumentType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait string extends HTTPArgumentType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}
