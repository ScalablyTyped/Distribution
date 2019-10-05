package typings.winrtDashUwp.Windows.Networking.Connectivity

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
  sealed trait cdma1xEvdo extends WwanDataClass
  
  /** The network provides 1xEVDO RevA data service. */
  @js.native
  sealed trait cdma1xEvdoRevA extends WwanDataClass
  
  /** The network provides 1xEVDO RevB data service. */
  @js.native
  sealed trait cdma1xEvdoRevB extends WwanDataClass
  
  /** The network provides CDMA Evolution-Data/Voice (also known as CDMA 2000 1x EV-DV, or 1x EVDV) data service is supported. */
  @js.native
  sealed trait cdma1xEvdv extends WwanDataClass
  
  /** The network provides CDMA 1x Radio Transmission Technology (1xRTT) data service. */
  @js.native
  sealed trait cdma1xRtt extends WwanDataClass
  
  /** The network provides CDMA 3x Radio Transmission Technology (3xRTT) data service. */
  @js.native
  sealed trait cdma3xRtt extends WwanDataClass
  
  /** The network provides UMB data service. */
  @js.native
  sealed trait cdmaUmb extends WwanDataClass
  
  /** The network provides a data service not listed in this table. */
  @js.native
  sealed trait custom extends WwanDataClass
  
  /** The network provides Enhanced Data for Global Evolution (EDGE). */
  @js.native
  sealed trait edge extends WwanDataClass
  
  /** The network provides General Packet Radio Service (GPRS) data service. */
  @js.native
  sealed trait gprs extends WwanDataClass
  
  /** The network provides High-Speed Downlink Packet Access (HSDPA) data service. */
  @js.native
  sealed trait hsdpa extends WwanDataClass
  
  /** The network provides High-Speed Uplink Packet Access (HSUPA) data service. */
  @js.native
  sealed trait hsupa extends WwanDataClass
  
  /** The network provides LTE Advanced data service. */
  @js.native
  sealed trait lteAdvanced extends WwanDataClass
  
  /** The network does not provide a data service. */
  @js.native
  sealed trait none extends WwanDataClass
  
  /** The network provides Universal Mobile Telecommunications System (UMTS) data service. */
  @js.native
  sealed trait umts extends WwanDataClass
  
  /* 8 */ val cdma1xEvdo: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdo with Double = js.native
  /* 9 */ val cdma1xEvdoRevA: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevA with Double = js.native
  /* 12 */ val cdma1xEvdoRevB: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevB with Double = js.native
  /* 10 */ val cdma1xEvdv: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdv with Double = js.native
  /* 7 */ val cdma1xRtt: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xRtt with Double = js.native
  /* 11 */ val cdma3xRtt: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma3xRtt with Double = js.native
  /* 13 */ val cdmaUmb: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdmaUmb with Double = js.native
  /* 14 */ val custom: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.custom with Double = js.native
  /* 2 */ val edge: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.edge with Double = js.native
  /* 1 */ val gprs: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.gprs with Double = js.native
  /* 4 */ val hsdpa: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.hsdpa with Double = js.native
  /* 5 */ val hsupa: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.hsupa with Double = js.native
  /* 6 */ val lteAdvanced: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.lteAdvanced with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.none with Double = js.native
  /* 3 */ val umts: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.umts with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WwanDataClass with Double] = js.native
}

