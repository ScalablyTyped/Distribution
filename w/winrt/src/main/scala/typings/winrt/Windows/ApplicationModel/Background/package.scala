package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackgroundTaskCanceledEventHandler = js.Function2[
/* sender */ IBackgroundTaskInstance, 
/* reason */ BackgroundTaskCancellationReason, 
Unit]

type BackgroundTaskCompletedEventHandler = js.Function2[
/* sender */ BackgroundTaskRegistration, 
/* args */ BackgroundTaskCompletedEventArgs, 
Unit]

type BackgroundTaskProgressEventHandler = js.Function2[
/* sender */ BackgroundTaskRegistration, 
/* args */ BackgroundTaskProgressEventArgs, 
Unit]

type INetworkOperatorHotspotAuthenticationTrigger = IBackgroundTrigger

type PushNotificationTrigger = IBackgroundTrigger
