package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayStreamType extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayStreamType")
@js.native
object AVPlayStreamType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayStreamType with String] = js.native
  
  @js.native
  sealed trait AUDIO extends AVPlayStreamType
  /* "AUDIO" */ @js.native
  object AUDIO extends TopLevel[AUDIO with String]
  
  @js.native
  sealed trait TEXT extends AVPlayStreamType
  /* "TEXT" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  @js.native
  sealed trait VIDEO extends AVPlayStreamType
  /* "VIDEO" */ @js.native
  object VIDEO extends TopLevel[VIDEO with String]
}
