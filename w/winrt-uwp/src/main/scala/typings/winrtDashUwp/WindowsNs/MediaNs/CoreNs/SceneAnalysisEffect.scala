package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.sceneanalyzed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that analyzes video frames to determine if any of the supported variable photo sequence capture techniques may produce a higher-quality captured image. */
@JSGlobal("Windows.Media.Core.SceneAnalysisEffect")
@js.native
abstract class SceneAnalysisEffect () extends js.Object {
  /** Gets or sets the duration of the time window during which video frames are analyzed. */
  var desiredAnalysisInterval: Double = js.native
  /** Gets or sets a HighDynamicRangeControl object that is used to enable or disable High Dynamic Range (HDR) analysis. */
  var highDynamicRangeAnalyzer: HighDynamicRangeControl = js.native
  /** Raised when the scene analysis is complete. */
  @JSName("onsceneanalyzed")
  var onsceneanalyzed_Original: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sceneanalyzed(`type`: sceneanalyzed, listener: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]): Unit = js.native
  /** Raised when the scene analysis is complete. */
  def onsceneanalyzed(ev: SceneAnalyzedEventArgs with WinRTEvent[SceneAnalysisEffect]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sceneanalyzed(`type`: sceneanalyzed, listener: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]): Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: IPropertySet): Unit = js.native
}

