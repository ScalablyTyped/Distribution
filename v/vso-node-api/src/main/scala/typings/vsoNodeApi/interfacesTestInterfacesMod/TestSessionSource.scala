package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestSessionSource extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionSource")
@js.native
object TestSessionSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionSource & Double] = js.native
  
  /**
    * The session was created from feedback client.
    */
  @js.native
  sealed trait FeedbackDesktop
    extends StObject
       with TestSessionSource
  /* 2 */ val FeedbackDesktop: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.FeedbackDesktop & Double = js.native
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait FeedbackWeb
    extends StObject
       with TestSessionSource
  /* 4 */ val FeedbackWeb: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.FeedbackWeb & Double = js.native
  
  /**
    * To show sessions from all supported sources.
    */
  @js.native
  sealed trait SessionInsightsForAll
    extends StObject
       with TestSessionSource
  /* 6 */ val SessionInsightsForAll: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.SessionInsightsForAll & Double = js.native
  
  /**
    * Source of test session uncertain as it is stale
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with TestSessionSource
  /* 0 */ val Unknown: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.Unknown & Double = js.native
  
  /**
    * The session was created from Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop
    extends StObject
       with TestSessionSource
  /* 1 */ val XTDesktop: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.XTDesktop & Double = js.native
  
  /**
    * The session was created from web access using Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop2
    extends StObject
       with TestSessionSource
  /* 5 */ val XTDesktop2: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.XTDesktop2 & Double = js.native
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait XTWeb
    extends StObject
       with TestSessionSource
  /* 3 */ val XTWeb: typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource.XTWeb & Double = js.native
}
