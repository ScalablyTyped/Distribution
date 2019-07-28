package typings.winrt.WindowsNs.MediaNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

