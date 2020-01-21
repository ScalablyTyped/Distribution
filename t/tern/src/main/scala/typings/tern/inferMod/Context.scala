package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.tern.AnonBool
import typings.tern.AnonName
import typings.tern.AnonNameString
import typings.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Prim with AnonBool
  /** The primitive number type. */
  var num: Prim with AnonName
  var parent: js.UndefOr[Server] = js.undefined
  /** The primitive string type. */
  var str: Prim with AnonNameString
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
object Context extends TopLevel[ContextConstructor]

