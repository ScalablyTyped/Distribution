package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeleteFile extends ResourceOperation {
  /**
       * A delete
       */
  @JSName("kind")
  var kind_DeleteFile: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.delete
  /**
       * Delete options.
       */
  var options: js.UndefOr[DeleteFileOptions] = js.undefined
  /**
       * The file to delete.
       */
  var uri: java.lang.String
}

