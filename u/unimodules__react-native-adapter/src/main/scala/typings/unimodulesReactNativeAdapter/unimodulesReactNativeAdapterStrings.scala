package typings.unimodulesReactNativeAdapter

import typings.unimodulesReactNativeAdapter.platformMod._PlatformSelectOSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unimodulesReactNativeAdapterStrings {
  
  @scala.inline
  def PlatformSelect: PlatformSelect = "PlatformSelect".asInstanceOf[PlatformSelect]
  
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def electron: electron = "electron".asInstanceOf[electron]
  
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @scala.inline
  def macos: macos = "macos".asInstanceOf[macos]
  
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
  
  @js.native
  sealed trait PlatformSelect extends js.Object
  
  @js.native
  sealed trait android extends js.Object
  
  @js.native
  sealed trait default extends _PlatformSelectOSType
  
  @js.native
  sealed trait electron extends _PlatformSelectOSType
  
  @js.native
  sealed trait ios extends js.Object
  
  @js.native
  sealed trait macos extends js.Object
  
  @js.native
  sealed trait native extends _PlatformSelectOSType
  
  @js.native
  sealed trait web extends js.Object
  
  @js.native
  sealed trait windows extends js.Object
}
