package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.sceneanalyzed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an effect that analyzes video frames to determine if any of the supported variable photo sequence capture techniques may produce a higher-quality captured image. */
@js.native
trait SceneAnalysisEffect extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sceneanalyzed(`type`: sceneanalyzed, listener: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]): Unit = js.native
  
  /** Gets or sets the duration of the time window during which video frames are analyzed. */
  var desiredAnalysisInterval: Double = js.native
  
  /** Gets or sets a HighDynamicRangeControl object that is used to enable or disable High Dynamic Range (HDR) analysis. */
  var highDynamicRangeAnalyzer: HighDynamicRangeControl = js.native
  
  /** Raised when the scene analysis is complete. */
  def onsceneanalyzed(ev: SceneAnalyzedEventArgs & WinRTEvent[SceneAnalysisEffect]): Unit = js.native
  /** Raised when the scene analysis is complete. */
  @JSName("onsceneanalyzed")
  var onsceneanalyzed_Original: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sceneanalyzed(`type`: sceneanalyzed, listener: TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]): Unit = js.native
  
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: IPropertySet): Unit = js.native
}
