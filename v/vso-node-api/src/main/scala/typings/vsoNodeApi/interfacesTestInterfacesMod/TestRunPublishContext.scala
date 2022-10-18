package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunPublishContext extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunPublishContext")
@js.native
object TestRunPublishContext extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunPublishContext & Double] = js.native
  
  /**
    * Run is published for any Context.
    */
  @js.native
  sealed trait All
    extends StObject
       with TestRunPublishContext
  /* 3 */ val All: typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunPublishContext.All & Double = js.native
  
  /**
    * Run is published for Build Context.
    */
  @js.native
  sealed trait Build
    extends StObject
       with TestRunPublishContext
  /* 1 */ val Build: typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunPublishContext.Build & Double = js.native
  
  /**
    * Run is published for Release Context.
    */
  @js.native
  sealed trait Release
    extends StObject
       with TestRunPublishContext
  /* 2 */ val Release: typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunPublishContext.Release & Double = js.native
}
