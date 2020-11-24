package typings.wpapi

import typings.wpapi.mod.HTTPArgumentType
import typings.wpapi.mod.HTTPMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wpapiStrings {
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait DELETE extends HTTPMethod
  
  @js.native
  sealed trait GET extends HTTPMethod
  
  @js.native
  sealed trait PATCH extends HTTPMethod
  
  @js.native
  sealed trait POST extends HTTPMethod
  
  @js.native
  sealed trait PUT extends HTTPMethod
  
  @js.native
  sealed trait array extends HTTPArgumentType
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait boolean extends HTTPArgumentType
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait integer extends HTTPArgumentType
  
  @js.native
  sealed trait number extends HTTPArgumentType
  
  @js.native
  sealed trait `object` extends HTTPArgumentType
  
  @js.native
  sealed trait string extends HTTPArgumentType
}
