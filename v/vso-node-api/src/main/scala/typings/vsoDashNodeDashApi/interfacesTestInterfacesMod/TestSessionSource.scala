package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestSessionSource extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionSource")
@js.native
object TestSessionSource extends js.Object {
  /**
    * The session was created from feedback client.
    */
  @js.native
  sealed trait FeedbackDesktop extends TestSessionSource
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait FeedbackWeb extends TestSessionSource
  
  /**
    * To show sessions from all supported sources.
    */
  @js.native
  sealed trait SessionInsightsForAll extends TestSessionSource
  
  /**
    * Source of test session uncertain as it is stale
    */
  @js.native
  sealed trait Unknown extends TestSessionSource
  
  /**
    * The session was created from Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop extends TestSessionSource
  
  /**
    * The session was created from web access using Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop2 extends TestSessionSource
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait XTWeb extends TestSessionSource
  
  /* 2 */ val FeedbackDesktop: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.FeedbackDesktop with Double = js.native
  /* 4 */ val FeedbackWeb: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.FeedbackWeb with Double = js.native
  /* 6 */ val SessionInsightsForAll: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.SessionInsightsForAll with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.Unknown with Double = js.native
  /* 1 */ val XTDesktop: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.XTDesktop with Double = js.native
  /* 5 */ val XTDesktop2: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.XTDesktop2 with Double = js.native
  /* 3 */ val XTWeb: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource.XTWeb with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionSource with Double] = js.native
}

