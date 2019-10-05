package typings.tern.libInferMod

import org.scalablytyped.runtime.TopLevel
import typings.tern.Anon_Bool
import typings.tern.Anon_Name
import typings.tern.Anon_NameString
import typings.tern.libTernMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Prim with Anon_Bool
  /** The primitive number type. */
  var num: Prim with Anon_Name
  var parent: js.UndefOr[Server] = js.undefined
  /** The primitive string type. */
  var str: Prim with Anon_NameString
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
object Context extends TopLevel[ContextConstructor]

