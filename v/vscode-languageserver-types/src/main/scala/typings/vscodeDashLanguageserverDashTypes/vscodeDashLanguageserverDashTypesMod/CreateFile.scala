package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFile extends ResourceOperation {
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: create
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.undefined
  /**
    * The resource to create.
    */
  var uri: String
}

object CreateFile {
  @scala.inline
  def apply(kind: create, uri: String, options: CreateFileOptions = null): CreateFile = {
    val __obj = js.Dynamic.literal(kind = kind, uri = uri)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CreateFile]
  }
}

