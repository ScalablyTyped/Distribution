package typings
package webcolaLib.distSrcD3adaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait D3v3Context extends js.Object {
  var version: java.lang.String
}

object D3v3Context {
  @scala.inline
  def apply(version: java.lang.String): D3v3Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[D3v3Context]
  }
}

