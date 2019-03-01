package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameFile extends ResourceOperation {
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.rename
  /**
    * The new location.
    */
  var newUri: java.lang.String
  /**
    * The old (existing) location.
    */
  var oldUri: java.lang.String
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.undefined
}

object RenameFile {
  @scala.inline
  def apply(
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.rename,
    newUri: java.lang.String,
    oldUri: java.lang.String,
    options: RenameFileOptions = null
  ): RenameFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("newUri")(newUri)
    __obj.updateDynamic("oldUri")(oldUri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[RenameFile]
  }
}

