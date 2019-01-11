package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabtab", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def completionItem(item: tabtabLib.tabtabMod.CompleteItemOrString): tabtabLib.tabtabMod.CompleteItem = js.native
  def install(option: tabtabLib.tabtabMod.InstallOption): js.Promise[scala.Unit] = js.native
  def log(
    args: js.Array[
      tabtabLib.tabtabMod.CompleteItem | tabtabLib.tabtabMod.CompleteItemOrString | java.lang.String
    ]
  ): scala.Unit = js.native
  def parseEnv(env: tabtabLib.tabtabMod.Json): tabtabLib.tabtabMod.TabtabEnv = js.native
  def uninstall(option: tabtabLib.tabtabMod.UninstallOption): js.Promise[scala.Unit] = js.native
}

