package typings.yeomanEnvironment.anon

import typings.textTable.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(
    /** An array of arrays containing strings, numbers, or other printable values. */
  rows: js.Array[js.Array[js.Object]]
  ): String = js.native
  def apply(
    /** An array of arrays containing strings, numbers, or other printable values. */
  rows: js.Array[js.Array[js.Object]],
    /** A configuration object to customize table output. */
  options: Options
  ): String = js.native
}
