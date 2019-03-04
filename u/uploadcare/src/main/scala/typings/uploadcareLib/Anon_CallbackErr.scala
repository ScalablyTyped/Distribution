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

object Anon_CallbackErr {
  @scala.inline
  def apply(
    remove: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ nodeLib.Error, 
        /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
        scala.Unit
      ], 
      scala.Unit
    ],
    store: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ nodeLib.Error, 
        /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_CallbackErr = {
    val __obj = js.Dynamic.literal(remove = remove, store = store)
  
    __obj.asInstanceOf[Anon_CallbackErr]
  }
}

