package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdo
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevA
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevB
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdv
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xRtt
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdma3xRtt
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.cdmaUmb
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.custom
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.edge
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.gprs
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.hsdpa
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.hsupa
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.lteAdvanced
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.none
import typings.winrtDashUwp.Windows.Networking.Connectivity.WwanDataClass.umts
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WwanDataClass with Double] = js.native
  /* 8 */ @js.native
  object cdma1xEvdo extends TopLevel[cdma1xEvdo with Double]
  
  /* 9 */ @js.native
  object cdma1xEvdoRevA extends TopLevel[cdma1xEvdoRevA with Double]
  
  /* 12 */ @js.native
  object cdma1xEvdoRevB extends TopLevel[cdma1xEvdoRevB with Double]
  
  /* 10 */ @js.native
  object cdma1xEvdv extends TopLevel[cdma1xEvdv with Double]
  
  /* 7 */ @js.native
  object cdma1xRtt extends TopLevel[cdma1xRtt with Double]
  
  /* 11 */ @js.native
  object cdma3xRtt extends TopLevel[cdma3xRtt with Double]
  
  /* 13 */ @js.native
  object cdmaUmb extends TopLevel[cdmaUmb with Double]
  
  /* 14 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 2 */ @js.native
  object edge extends TopLevel[edge with Double]
  
  /* 1 */ @js.native
  object gprs extends TopLevel[gprs with Double]
  
  /* 4 */ @js.native
  object hsdpa extends TopLevel[hsdpa with Double]
  
  /* 5 */ @js.native
  object hsupa extends TopLevel[hsupa with Double]
  
  /* 6 */ @js.native
  object lteAdvanced extends TopLevel[lteAdvanced with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object umts extends TopLevel[umts with Double]
  
}

