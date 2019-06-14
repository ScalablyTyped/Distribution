package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WwanDataClass extends js.Object

/** Defines values used to indicate the class of data service provided by a WWAN network connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanDataClass")
@js.native
object WwanDataClass extends js.Object {
  /** This network provides CDMA Evolution-Data Optimized (originally Data Only, 1xEDVO, also known as CDMA2000 1x EV-DO, or 1x EVDO) data service. */
  @js.native
  sealed trait cdma1xEvdo
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides 1xEVDO RevA data service. */
  @js.native
  sealed trait cdma1xEvdoRevA
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides 1xEVDO RevB data service. */
  @js.native
  sealed trait cdma1xEvdoRevB
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides CDMA Evolution-Data/Voice (also known as CDMA 2000 1x EV-DV, or 1x EVDV) data service is supported. */
  @js.native
  sealed trait cdma1xEvdv
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides CDMA 1x Radio Transmission Technology (1xRTT) data service. */
  @js.native
  sealed trait cdma1xRtt
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides CDMA 3x Radio Transmission Technology (3xRTT) data service. */
  @js.native
  sealed trait cdma3xRtt
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides UMB data service. */
  @js.native
  sealed trait cdmaUmb
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides a data service not listed in this table. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides Enhanced Data for Global Evolution (EDGE). */
  @js.native
  sealed trait edge
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides General Packet Radio Service (GPRS) data service. */
  @js.native
  sealed trait gprs
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides High-Speed Downlink Packet Access (HSDPA) data service. */
  @js.native
  sealed trait hsdpa
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides High-Speed Uplink Packet Access (HSUPA) data service. */
  @js.native
  sealed trait hsupa
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides LTE Advanced data service. */
  @js.native
  sealed trait lteAdvanced
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network does not provide a data service. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
  /** The network provides Universal Mobile Telecommunications System (UMTS) data service. */
  @js.native
  sealed trait umts
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass
  
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
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanDataClass with scala.Double
  ] = js.native
}

