package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackErr extends js.Object {
  def remove(
    uuid: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]
  ): scala.Unit
  def store(
    uuid: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackErr {
  @scala.inline
  def apply(
    remove: (java.lang.String, js.Function2[
      /* err */ stdLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]) => scala.Unit,
    store: (java.lang.String, js.Function2[
      /* err */ stdLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ]) => scala.Unit
  ): Anon_CallbackErr = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
  
    __obj.asInstanceOf[Anon_CallbackErr]
  }
}

