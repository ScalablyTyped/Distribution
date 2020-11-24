package typings.verror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * SError is like VError, but stricter about types.  You cannot pass "null" or
  * "undefined" as string arguments to the formatter.  Since SError is only a
  * different function, not really a different class, we don't set
  * SError.prototype.name.
  */
@JSImport("verror", "SError")
@js.native
class SError () extends VError
