package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: vegaDashLiteLib.buildSrcChannelMod.NonPositionChannel
  var fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: vegaDashLiteLib.buildSrcChannelMod.NonPositionChannel,
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, fieldDef = fieldDef)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

