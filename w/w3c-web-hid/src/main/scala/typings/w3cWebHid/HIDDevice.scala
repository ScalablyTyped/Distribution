package typings.w3cWebHid

import typings.std.BufferSource
import typings.std.EventTarget
import typings.w3cWebHid.w3cWebHidStrings.inputreport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hiddevice-interface */
@js.native
trait HIDDevice
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_inputreport(
    `type`: inputreport,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HIDInputReportEvent, Any]
  ): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  val collections: js.Array[HIDCollectionInfo] = js.native
  
  def forget(): js.Promise[Unit] = js.native
  
  var oninputreport: (js.ThisFunction1[/* this */ this.type, /* ev */ HIDInputReportEvent, Any]) | Null = js.native
  
  def open(): js.Promise[Unit] = js.native
  
  val opened: Boolean = js.native
  
  val productId: Double = js.native
  
  val productName: String = js.native
  
  def receiveFeatureReport(reportId: Double): js.Promise[js.typedarray.DataView] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_inputreport(
    `type`: inputreport,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ HIDInputReportEvent, Any]
  ): Unit = js.native
  
  def sendFeatureReport(reportId: Double, data: BufferSource): js.Promise[Unit] = js.native
  
  def sendReport(reportId: Double, data: BufferSource): js.Promise[Unit] = js.native
  
  val vendorId: Double = js.native
}
