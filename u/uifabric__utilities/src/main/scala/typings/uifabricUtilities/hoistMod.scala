package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/hoist", JSImport.Namespace)
@js.native
object hoistMod extends js.Object {
  def hoistMethods(destination: js.Any, source: js.Any): js.Array[String] = js.native
  def hoistMethods(destination: js.Any, source: js.Any, exclusions: js.Array[String]): js.Array[String] = js.native
  def unhoistMethods(source: js.Any, methodNames: js.Array[String]): Unit = js.native
}

