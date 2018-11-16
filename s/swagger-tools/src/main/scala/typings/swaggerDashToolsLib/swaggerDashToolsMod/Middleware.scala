package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  def swaggerMetadata(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def swaggerSecurity(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def swaggerSecurity(options: SwaggerSecurityOptions): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def swaggerValidator(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def swaggerValidator(options: SwaggerValidatorOptions): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
}

