package typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryMod

import typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.ConnectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library", JSImport.Namespace)
@js.native
class ^ ()
  extends typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.^ {
  def this(config: ConnectionParams) = this()
}

@JSImport("ts3-nodejs-library", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Filters an Object with given Option
    * @param - The Object which should get filtered
    * @param - Filter Object
    */
  def filter(array: js.Array[_], filter: js.Any): js.Promise[js.Array[_]] = js.native
}

