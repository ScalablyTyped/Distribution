package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestSessionSource extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionSource")
@js.native
object TestSessionSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionSource with Double] = js.native
  
  /**
    * The session was created from feedback client.
    */
  @js.native
  sealed trait FeedbackDesktop extends TestSessionSource
  /* 2 */ val FeedbackDesktop: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.FeedbackDesktop with Double = js.native
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait FeedbackWeb extends TestSessionSource
  /* 4 */ val FeedbackWeb: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.FeedbackWeb with Double = js.native
  
  /**
    * To show sessions from all supported sources.
    */
  @js.native
  sealed trait SessionInsightsForAll extends TestSessionSource
  /* 6 */ val SessionInsightsForAll: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.SessionInsightsForAll with Double = js.native
  
  /**
    * Source of test session uncertain as it is stale
    */
  @js.native
  sealed trait Unknown extends TestSessionSource
  /* 0 */ val Unknown: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.Unknown with Double = js.native
  
  /**
    * The session was created from Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop extends TestSessionSource
  /* 1 */ val XTDesktop: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.XTDesktop with Double = js.native
  
  /**
    * The session was created from web access using Microsoft Test Manager exploratory desktop tool.
    */
  @js.native
  sealed trait XTDesktop2 extends TestSessionSource
  /* 5 */ val XTDesktop2: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.XTDesktop2 with Double = js.native
  
  /**
    * The session was created from browser extension.
    */
  @js.native
  sealed trait XTWeb extends TestSessionSource
  /* 3 */ val XTWeb: typings.vsoNodeApi.testInterfacesMod.TestSessionSource.XTWeb with Double = js.native
}
