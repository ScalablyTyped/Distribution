package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.NonPositionChannel
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelFieldDef extends StObject {
  
  var channel: NonPositionChannel = js.native
  
  var fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null] = js.native
}
object ChannelFieldDef {
  
  @scala.inline
  def apply(
    channel: NonPositionChannel,
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]
  ): ChannelFieldDef = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelFieldDef]
  }
  
  @scala.inline
  implicit class ChannelFieldDefMutableBuilder[Self <: ChannelFieldDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: NonPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef(value: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
  }
}
