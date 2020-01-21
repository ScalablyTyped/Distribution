package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionSource with Double] = js.native
  /* 2 */ @js.native
  object FeedbackDesktop extends TopLevel[FeedbackDesktop with Double]
  
  /* 4 */ @js.native
  object FeedbackWeb extends TopLevel[FeedbackWeb with Double]
  
  /* 6 */ @js.native
  object SessionInsightsForAll extends TopLevel[SessionInsightsForAll with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 1 */ @js.native
  object XTDesktop extends TopLevel[XTDesktop with Double]
  
  /* 5 */ @js.native
  object XTDesktop2 extends TopLevel[XTDesktop2 with Double]
  
  /* 3 */ @js.native
  object XTWeb extends TopLevel[XTWeb with Double]
  
}

