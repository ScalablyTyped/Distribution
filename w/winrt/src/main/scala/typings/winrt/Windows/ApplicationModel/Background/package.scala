package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackgroundTaskCanceledEventHandler = js.Function2[
/* sender */ typings.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance, 
/* reason */ typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason, 
scala.Unit]

type BackgroundTaskCompletedEventHandler = js.Function2[
/* sender */ typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration, 
/* args */ typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs, 
scala.Unit]

type BackgroundTaskProgressEventHandler = js.Function2[
/* sender */ typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration, 
/* args */ typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs, 
scala.Unit]

type INetworkOperatorHotspotAuthenticationTrigger = typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger

type PushNotificationTrigger = typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
