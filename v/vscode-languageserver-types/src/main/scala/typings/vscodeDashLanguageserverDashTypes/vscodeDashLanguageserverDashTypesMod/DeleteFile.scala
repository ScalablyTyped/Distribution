package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFile extends ResourceOperation {
  /**
    * A delete
    */
  @JSName("kind")
  var kind_DeleteFile: delete
  /**
    * Delete options.
    */
  var options: js.UndefOr[DeleteFileOptions] = js.undefined
  /**
    * The file to delete.
    */
  var uri: String
}

object DeleteFile {
  @scala.inline
  def apply(kind: delete, uri: String, options: DeleteFileOptions = null): DeleteFile = {
    val __obj = js.Dynamic.literal(kind = kind, uri = uri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DeleteFile]
  }
}

