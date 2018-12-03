package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabtab", JSImport.Namespace)
@js.native
object tabtabModMembers extends js.Object {
  def completionItem(item: CompleteItemOrString): CompleteItem = js.native
  def install(option: InstallOption): stdLib.Promise[scala.Unit] = js.native
  def log(args: js.Array[java.lang.String | CompleteItem | CompleteItemOrString]): scala.Unit = js.native
  def parseEnv(env: Json): TabtabEnv = js.native
  def uninstall(option: UninstallOption): stdLib.Promise[scala.Unit] = js.native
}

