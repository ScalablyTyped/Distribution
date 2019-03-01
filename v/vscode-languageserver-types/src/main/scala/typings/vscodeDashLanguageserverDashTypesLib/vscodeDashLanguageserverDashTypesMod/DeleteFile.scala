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

object DeleteFile {
  @scala.inline
  def apply(
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.delete,
    uri: java.lang.String,
    options: DeleteFileOptions = null
  ): DeleteFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("uri")(uri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DeleteFile]
  }
}

