package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataClasses extends js.Object

/** Describes the cellular data services supported by a mobile broadband network device. */
@JSGlobal("Windows.Networking.NetworkOperators.DataClasses")
@js.native
object DataClasses extends js.Object {
  /** The device supports the 1xEV-DO data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdo
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the 1xEV-DO RevA data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdoRevA
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the 1xEV-DO RevB data service, which is identified for future use. */
  @js.native
  sealed trait cdma1xEvdoRevB
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the 1xEV-DV data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdv
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the 1xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xRtt
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the 3xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma3xRtt
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the UMB data service implemented by CDMA providers. */
  @js.native
  sealed trait cdmaUmb
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports a custom data service. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the EDGE data service implemented by GSM providers. */
  @js.native
  sealed trait edge
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the GPRS data service implemented by GSM providers. */
  @js.native
  sealed trait gprs
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the HSDPA data service implemented by GSM providers. */
  @js.native
  sealed trait hsdpa
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the HSUPA (High Speed Uplink Packet Access) data service. */
  @js.native
  sealed trait hsupa
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the HSDPA Lite data service implemented by GSM providers. */
  @js.native
  sealed trait lteAdvanced
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** No data services supported. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  /** The device supports the UMTS data service implemented by GSM providers. */
  @js.native
  sealed trait umts
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses
  
  val cdma1xEvdo: cdma1xEvdo with java.lang.String = js.native
  val cdma1xEvdoRevA: cdma1xEvdoRevA with java.lang.String = js.native
  val cdma1xEvdoRevB: cdma1xEvdoRevB with java.lang.String = js.native
  val cdma1xEvdv: cdma1xEvdv with java.lang.String = js.native
  val cdma1xRtt: cdma1xRtt with java.lang.String = js.native
  val cdma3xRtt: cdma3xRtt with java.lang.String = js.native
  val cdmaUmb: cdmaUmb with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val edge: edge with java.lang.String = js.native
  val gprs: gprs with java.lang.String = js.native
  val hsdpa: hsdpa with java.lang.String = js.native
  val hsupa: hsupa with java.lang.String = js.native
  val lteAdvanced: lteAdvanced with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val umts: umts with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses with java.lang.String
  ] = js.native
}

