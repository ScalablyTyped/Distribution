package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOMParser extends js.Object {
  def parseFromString(str: java.lang.String, `type`: SupportedType): Document
}

@JSGlobal("DOMParser")
@js.native
object DOMParser
  extends ScalablyTyped.runtime.Instantiable0[DOMParser]

