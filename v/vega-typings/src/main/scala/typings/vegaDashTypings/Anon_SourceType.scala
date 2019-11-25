package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecStreamMod.WindowEventType
import typings.vegaDashTypings.vegaDashTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceType extends js.Object {
  var source: window
  var `type`: WindowEventType
}

object Anon_SourceType {
  @scala.inline
  def apply(source: window, `type`: WindowEventType): Anon_SourceType = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SourceType]
  }
}

