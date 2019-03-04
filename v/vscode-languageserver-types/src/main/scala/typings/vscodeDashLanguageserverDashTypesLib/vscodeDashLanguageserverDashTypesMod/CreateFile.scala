package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFile extends ResourceOperation {
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.create
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.undefined
  /**
    * The resource to create.
    */
  var uri: java.lang.String
}

object CreateFile {
  @scala.inline
  def apply(
    kind: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesLibStrings.create,
    uri: java.lang.String,
    options: CreateFileOptions = null
  ): CreateFile = {
    val __obj = js.Dynamic.literal(kind = kind, uri = uri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CreateFile]
  }
}

