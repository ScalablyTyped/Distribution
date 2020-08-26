package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.tern.anon.Primnamebool
import typings.tern.anon.Primnamenumber
import typings.tern.anon.Primnamestring
import typings.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Primnamebool = js.native
  /** The primitive number type. */
  var num: Primnamenumber = js.native
  var parent: js.UndefOr[Server] = js.native
  /** The primitive string type. */
  var str: Primnamestring = js.native
  var topScope: Scope = js.native
}

@JSImport("tern/lib/infer", "Context")
@js.native
object Context extends TopLevel[ContextConstructor]

