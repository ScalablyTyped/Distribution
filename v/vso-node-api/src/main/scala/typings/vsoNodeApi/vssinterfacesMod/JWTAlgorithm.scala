package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JWTAlgorithm extends StObject
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "JWTAlgorithm")
@js.native
object JWTAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JWTAlgorithm & Double] = js.native
  
  @js.native
  sealed trait HS256
    extends StObject
       with JWTAlgorithm
  /* 1 */ val HS256: typings.vsoNodeApi.vssinterfacesMod.JWTAlgorithm.HS256 & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JWTAlgorithm
  /* 0 */ val None: typings.vsoNodeApi.vssinterfacesMod.JWTAlgorithm.None & Double = js.native
  
  @js.native
  sealed trait RS256
    extends StObject
       with JWTAlgorithm
  /* 2 */ val RS256: typings.vsoNodeApi.vssinterfacesMod.JWTAlgorithm.RS256 & Double = js.native
}
