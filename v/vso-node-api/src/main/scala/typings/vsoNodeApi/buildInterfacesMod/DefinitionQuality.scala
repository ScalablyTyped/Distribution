package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionQuality extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQuality")
@js.native
object DefinitionQuality extends js.Object {
  @js.native
  sealed trait Definition extends DefinitionQuality
  
  @js.native
  sealed trait Draft extends DefinitionQuality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQuality with Double] = js.native
  /* 1 */ @js.native
  object Definition extends TopLevel[Definition with Double]
  
  /* 2 */ @js.native
  object Draft extends TopLevel[Draft with Double]
  
}

