package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tmp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dir(
    callback: js.Function3[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dir(config: tmpLib.tmpMod.Options): scala.Unit = js.native
  def dir(
    config: tmpLib.tmpMod.Options,
    callback: js.Function3[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dirSync(): tmpLib.tmpMod.SynchrounousResult = js.native
  def dirSync(config: tmpLib.tmpMod.Options): tmpLib.tmpMod.SynchrounousResult = js.native
  def file(
    callback: js.Function4[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* fd */ scala.Double, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def file(config: tmpLib.tmpMod.Options): scala.Unit = js.native
  def file(
    config: tmpLib.tmpMod.Options,
    callback: js.Function4[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* fd */ scala.Double, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fileSync(): tmpLib.tmpMod.SynchrounousResult = js.native
  def fileSync(config: tmpLib.tmpMod.Options): tmpLib.tmpMod.SynchrounousResult = js.native
  def setGracefulCleanup(): scala.Unit = js.native
  def tmpName(callback: js.Function2[/* err */ js.Any, /* path */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def tmpName(config: tmpLib.tmpMod.SimpleOptions): scala.Unit = js.native
  def tmpName(
    config: tmpLib.tmpMod.SimpleOptions,
    callback: js.Function2[/* err */ js.Any, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def tmpNameSync(): java.lang.String = js.native
  def tmpNameSync(config: tmpLib.tmpMod.SimpleOptions): java.lang.String = js.native
}

