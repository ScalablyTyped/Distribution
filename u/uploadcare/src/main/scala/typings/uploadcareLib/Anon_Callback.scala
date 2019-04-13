package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def fromUrl(
    url: java.lang.String,
    options: Anon_Store,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ uploadcareLib.uploadcareMod.File, scala.Unit]
  ): scala.Unit
  def upload(
    readStream: nodeLib.fsMod.ReadStream,
    options: Anon_Store,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ Anon_File, scala.Unit]
  ): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(
    fromUrl: (java.lang.String, Anon_Store, js.Function2[/* err */ stdLib.Error, /* res */ uploadcareLib.uploadcareMod.File, scala.Unit]) => scala.Unit,
    upload: (nodeLib.fsMod.ReadStream, Anon_Store, js.Function2[/* err */ stdLib.Error, /* res */ Anon_File, scala.Unit]) => scala.Unit
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

