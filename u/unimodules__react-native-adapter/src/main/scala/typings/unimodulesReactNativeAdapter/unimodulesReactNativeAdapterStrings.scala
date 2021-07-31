package typings.unimodulesReactNativeAdapter

import typings.unimodulesReactNativeAdapter.platformMod._PlatformSelectOSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unimodulesReactNativeAdapterStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with _PlatformSelectOSType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait PlatformSelect extends StObject
  @scala.inline
  def PlatformSelect: PlatformSelect = "PlatformSelect".asInstanceOf[PlatformSelect]
  
  @js.native
  sealed trait android extends StObject
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait electron
    extends StObject
       with _PlatformSelectOSType
  @scala.inline
  def electron: electron = "electron".asInstanceOf[electron]
  
  @js.native
  sealed trait ios extends StObject
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait macos extends StObject
  @scala.inline
  def macos: macos = "macos".asInstanceOf[macos]
  
  @js.native
  sealed trait native
    extends StObject
       with _PlatformSelectOSType
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait web extends StObject
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait windows extends StObject
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}
