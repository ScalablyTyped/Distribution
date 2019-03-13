package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dark extends js.Object {
  var dark: java.lang.String | vscodeLib.vscodeMod.Uri
  var light: java.lang.String | vscodeLib.vscodeMod.Uri
}

object Anon_Dark {
  @scala.inline
  def apply(
    dark: java.lang.String | vscodeLib.vscodeMod.Uri,
    light: java.lang.String | vscodeLib.vscodeMod.Uri
  ): Anon_Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dark]
  }
}

