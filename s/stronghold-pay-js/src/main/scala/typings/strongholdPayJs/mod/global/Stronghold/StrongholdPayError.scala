package typings.strongholdPayJs.mod.global.Stronghold

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Stronghold.StrongholdPayError")
@js.native
class StrongholdPayError protected () extends Error {
  def this(`type`: ERROR_TYPE, code: ERROR_CODE, message: String) = this()
  def this(`type`: ERROR_TYPE, code: ERROR_CODE, message: String, property: String) = this()
  
  var code: ERROR_CODE = js.native
  
  var property: String | Null = js.native
  
  var `type`: ERROR_TYPE = js.native
}
