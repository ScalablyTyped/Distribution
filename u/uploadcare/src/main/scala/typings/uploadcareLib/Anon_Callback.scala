package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def fromUrl(
    url: java.lang.String,
    options: Anon_Store,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]
  ): scala.Unit
  def upload(
    readStream: nodeLib.fsMod.ReadStream,
    options: Anon_Store,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ Anon_File, scala.Unit]
  ): scala.Unit
}

