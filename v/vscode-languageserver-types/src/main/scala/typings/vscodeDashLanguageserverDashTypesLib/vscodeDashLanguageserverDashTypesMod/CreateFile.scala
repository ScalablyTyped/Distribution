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

