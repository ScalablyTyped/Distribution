package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextMessageTargetMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "TextMessageTargetMode")
@js.native
object TextMessageTargetMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextMessageTargetMode & Double] = js.native
  
  /** target is a channel */
  @js.native
  sealed trait CHANNEL
    extends StObject
       with TextMessageTargetMode
  /* 2 */ val CHANNEL: typings.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.CHANNEL & Double = js.native
  
  /** target is a client */
  @js.native
  sealed trait CLIENT
    extends StObject
       with TextMessageTargetMode
  /* 1 */ val CLIENT: typings.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.CLIENT & Double = js.native
  
  /** target is a virtual server */
  @js.native
  sealed trait SERVER
    extends StObject
       with TextMessageTargetMode
  /* 3 */ val SERVER: typings.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.SERVER & Double = js.native
}
