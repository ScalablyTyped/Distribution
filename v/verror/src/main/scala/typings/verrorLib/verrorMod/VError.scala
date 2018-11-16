package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VError
  extends stdLib.Error {
  def cause(): js.UndefOr[stdLib.Error]
}

