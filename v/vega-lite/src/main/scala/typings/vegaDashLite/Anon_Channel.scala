package typings.vegaDashLite

import typings.vegaDashLite.buildSrcChannelMod.NonPositionChannel
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: NonPositionChannel
  var fieldDef: FieldDef[String]
}

object Anon_Channel {
  @scala.inline
  def apply(channel: NonPositionChannel, fieldDef: FieldDef[String]): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, fieldDef = fieldDef)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

