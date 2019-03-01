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

object Anon_Callback {
  @scala.inline
  def apply(
    fromUrl: js.Function3[
      java.lang.String, 
      Anon_Store, 
      js.Function2[
        /* err */ nodeLib.Error, 
        /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
        scala.Unit
      ], 
      scala.Unit
    ],
    upload: js.Function3[
      nodeLib.fsMod.ReadStream, 
      Anon_Store, 
      js.Function2[/* err */ nodeLib.Error, /* res */ Anon_File, scala.Unit], 
      scala.Unit
    ]
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromUrl")(fromUrl)
    __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[Anon_Callback]
  }
}

