package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends StObject
@JSImport("video.js", "videojs.ReadyState")
@js.native
object ReadyState extends StObject {
  
  @js.native
  sealed trait HaveCurrentData
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait HaveEnoughData
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait HaveFutureData
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait HaveMetadata
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait HaveNothing
    extends StObject
       with ReadyState
}
