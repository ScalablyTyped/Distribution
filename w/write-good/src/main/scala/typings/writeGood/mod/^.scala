package typings.writeGood.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write-good", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns a list of violations in the supplied `text`.
    */
  def apply(text: String): js.Array[Problem] = js.native
  def apply(text: String, options: Options): js.Array[Problem] = js.native
}
