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
  
  /* 8 */ val cdma1xEvdo: cdma1xEvdo with scala.Double = js.native
  /* 9 */ val cdma1xEvdoRevA: cdma1xEvdoRevA with scala.Double = js.native
  /* 12 */ val cdma1xEvdoRevB: cdma1xEvdoRevB with scala.Double = js.native
  /* 10 */ val cdma1xEvdv: cdma1xEvdv with scala.Double = js.native
  /* 7 */ val cdma1xRtt: cdma1xRtt with scala.Double = js.native
  /* 11 */ val cdma3xRtt: cdma3xRtt with scala.Double = js.native
  /* 13 */ val cdmaUmb: cdmaUmb with scala.Double = js.native
  /* 14 */ val custom: custom with scala.Double = js.native
  /* 2 */ val edge: edge with scala.Double = js.native
  /* 1 */ val gprs: gprs with scala.Double = js.native
  /* 4 */ val hsdpa: hsdpa with scala.Double = js.native
  /* 5 */ val hsupa: hsupa with scala.Double = js.native
  /* 6 */ val lteAdvanced: lteAdvanced with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val umts: umts with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.DataClasses with scala.Double
  ] = js.native
}

