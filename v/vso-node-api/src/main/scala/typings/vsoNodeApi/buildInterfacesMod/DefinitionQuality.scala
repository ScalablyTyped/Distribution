package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQuality extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQuality")
@js.native
object DefinitionQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQuality with Double] = js.native
  
  @js.native
  sealed trait Definition extends DefinitionQuality
  /* 1 */ val Definition: typings.vsoNodeApi.buildInterfacesMod.DefinitionQuality.Definition with Double = js.native
  
  @js.native
  sealed trait Draft extends DefinitionQuality
  /* 2 */ val Draft: typings.vsoNodeApi.buildInterfacesMod.DefinitionQuality.Draft with Double = js.native
}
