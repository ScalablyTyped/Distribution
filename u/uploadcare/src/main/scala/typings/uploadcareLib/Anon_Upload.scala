package typings
package uploadcareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Upload extends js.Object {
  var fromUrl: js.Function3[
    /* url */ java.lang.String, 
    /* options */ Anon_Store, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ uploadcareLib.uploadcareMod.UploadcareNs.File, 
      scala.Unit
    ], 
    scala.Unit
  ]
  var upload: js.Function3[
    /* readStream */ nodeLib.fsMod.ReadStream, 
    /* options */ Anon_Store, 
    /* callback */ js.Function2[/* err */ nodeLib.Error, /* res */ Anon_File, scala.Unit], 
    scala.Unit
  ]
}

