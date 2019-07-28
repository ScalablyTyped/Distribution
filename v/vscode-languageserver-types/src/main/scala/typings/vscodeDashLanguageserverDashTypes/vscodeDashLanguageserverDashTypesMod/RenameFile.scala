package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameFile extends ResourceOperation {
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: rename
  /**
    * The new location.
    */
  var newUri: String
  /**
    * The old (existing) location.
    */
  var oldUri: String
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.undefined
}

object RenameFile {
  @scala.inline
  def apply(kind: rename, newUri: String, oldUri: String, options: RenameFileOptions = null): RenameFile = {
    val __obj = js.Dynamic.literal(kind = kind, newUri = newUri, oldUri = oldUri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[RenameFile]
  }
}

