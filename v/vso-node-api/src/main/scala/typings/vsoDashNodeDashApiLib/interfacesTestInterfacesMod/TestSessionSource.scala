package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
  sealed trait FeedbackDesktop
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * The session was created from browser extension.
       */
  @js.native
  sealed trait FeedbackWeb
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * To show sessions from all supported sources.
       */
  @js.native
  sealed trait SessionInsightsForAll
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * Source of test session uncertain as it is stale
       */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * The session was created from Microsoft Test Manager exploratory desktop tool.
       */
  @js.native
  sealed trait XTDesktop
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * The session was created from web access using Microsoft Test Manager exploratory desktop tool.
       */
  @js.native
  sealed trait XTDesktop2
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /**
       * The session was created from browser extension.
       */
  @js.native
  sealed trait XTWeb
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  
  /* 2 */ val FeedbackDesktop: FeedbackDesktop with scala.Double = js.native
  /* 4 */ val FeedbackWeb: FeedbackWeb with scala.Double = js.native
  /* 6 */ val SessionInsightsForAll: SessionInsightsForAll with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 1 */ val XTDesktop: XTDesktop with scala.Double = js.native
  /* 5 */ val XTDesktop2: XTDesktop2 with scala.Double = js.native
  /* 3 */ val XTWeb: XTWeb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource with scala.Double
  ] = js.native
}

