package typings.tabtab.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabtab", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def completionItem(item: CompleteItemOrString): CompleteItem = js.native
  def install(option: InstallOption): js.Promise[Unit] = js.native
  def log(args: js.Array[CompleteItem | CompleteItemOrString | String]): Unit = js.native
  def parseEnv(env: Json): TabtabEnv = js.native
  def uninstall(option: UninstallOption): js.Promise[Unit] = js.native
}

