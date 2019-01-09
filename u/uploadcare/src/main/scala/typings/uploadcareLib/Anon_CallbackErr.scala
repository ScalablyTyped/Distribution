package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackErr extends js.Object {
  def remove(
    uuid: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]
  ): scala.Unit
  def store(
    uuid: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]
  ): scala.Unit
}

