package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaExtensionManager extends js.Object {
  
  def registerAudioDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerAudioDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerAudioEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerAudioEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String): Unit = js.native
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String, configuration: IPropertySet): Unit = js.native
  
  def registerSchemeHandler(activatableClassId: String, scheme: String): Unit = js.native
  def registerSchemeHandler(activatableClassId: String, scheme: String, configuration: IPropertySet): Unit = js.native
  
  def registerVideoDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerVideoDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerVideoEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerVideoEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
}
