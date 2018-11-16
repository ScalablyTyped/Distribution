package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaExtensionManager extends js.Object {
  def registerAudioDecoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String
  ): scala.Unit = js.native
  def registerAudioDecoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def registerAudioEncoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String
  ): scala.Unit = js.native
  def registerAudioEncoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def registerByteStreamHandler(activatableClassId: java.lang.String, fileExtension: java.lang.String, mimeType: java.lang.String): scala.Unit = js.native
  def registerByteStreamHandler(
    activatableClassId: java.lang.String,
    fileExtension: java.lang.String,
    mimeType: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def registerSchemeHandler(activatableClassId: java.lang.String, scheme: java.lang.String): scala.Unit = js.native
  def registerSchemeHandler(
    activatableClassId: java.lang.String,
    scheme: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def registerVideoDecoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String
  ): scala.Unit = js.native
  def registerVideoDecoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def registerVideoEncoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String
  ): scala.Unit = js.native
  def registerVideoEncoder(
    activatableClassId: java.lang.String,
    inputSubtype: java.lang.String,
    outputSubtype: java.lang.String,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
}

