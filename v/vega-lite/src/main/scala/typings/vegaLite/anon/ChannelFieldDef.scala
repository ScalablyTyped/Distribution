package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.NonPositionChannel
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFieldDef extends StObject {
  
  var channel: NonPositionChannel
  
  var fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]
}
object ChannelFieldDef {
  
  inline def apply(
    channel: NonPositionChannel,
    fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]
  ): ChannelFieldDef = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelFieldDef]
  }
  
  extension [Self <: ChannelFieldDef](x: Self) {
    
    inline def setChannel(value: NonPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
  }
}
