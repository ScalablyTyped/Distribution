package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_StoreUuid extends js.Object {
  var remove: js.Function2[
    /* uuid */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ], 
    scala.Unit
  ]
  var store: js.Function2[
    /* uuid */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ], 
    scala.Unit
  ]
}

