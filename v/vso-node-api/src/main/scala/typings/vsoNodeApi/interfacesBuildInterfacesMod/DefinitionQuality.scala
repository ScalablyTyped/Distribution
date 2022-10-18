package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQuality extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQuality")
@js.native
object DefinitionQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQuality & Double] = js.native
  
  @js.native
  sealed trait Definition
    extends StObject
       with DefinitionQuality
  /* 1 */ val Definition: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQuality.Definition & Double = js.native
  
  @js.native
  sealed trait Draft
    extends StObject
       with DefinitionQuality
  /* 2 */ val Draft: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQuality.Draft & Double = js.native
}
