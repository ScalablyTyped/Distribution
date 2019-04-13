package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  def swaggerMetadata(): connectLib.connectMod.NextHandleFunction = js.native
  def swaggerSecurity(): connectLib.connectMod.NextHandleFunction = js.native
  def swaggerSecurity(options: SwaggerSecurityOptions): connectLib.connectMod.NextHandleFunction = js.native
  def swaggerValidator(): connectLib.connectMod.NextHandleFunction = js.native
  def swaggerValidator(options: SwaggerValidatorOptions): connectLib.connectMod.NextHandleFunction = js.native
}

