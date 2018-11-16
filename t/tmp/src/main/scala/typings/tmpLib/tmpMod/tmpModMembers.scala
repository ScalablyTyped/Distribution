package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tmp", JSImport.Namespace)
@js.native
object tmpModMembers extends js.Object {
  def dir(
    callback: js.Function3[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dir(config: Options): scala.Unit = js.native
  def dir(
    config: Options,
    callback: js.Function3[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dirSync(): SynchrounousResult = js.native
  def dirSync(config: Options): SynchrounousResult = js.native
  def file(
    callback: js.Function4[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* fd */ scala.Double, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def file(config: Options): scala.Unit = js.native
  def file(
    config: Options,
    callback: js.Function4[
      /* err */ js.Any, 
      /* path */ java.lang.String, 
      /* fd */ scala.Double, 
      /* cleanupCallback */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fileSync(): SynchrounousResult = js.native
  def fileSync(config: Options): SynchrounousResult = js.native
  def setGracefulCleanup(): scala.Unit = js.native
  def tmpName(callback: js.Function2[/* err */ js.Any, /* path */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def tmpName(config: SimpleOptions): scala.Unit = js.native
  def tmpName(
    config: SimpleOptions,
    callback: js.Function2[/* err */ js.Any, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def tmpNameSync(): java.lang.String = js.native
  def tmpNameSync(config: SimpleOptions): java.lang.String = js.native
}

