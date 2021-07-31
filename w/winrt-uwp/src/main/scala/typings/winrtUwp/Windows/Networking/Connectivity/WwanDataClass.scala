package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WwanDataClass extends StObject
/** Defines values used to indicate the class of data service provided by a WWAN network connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanDataClass")
@js.native
object WwanDataClass extends StObject {
  
  /** This network provides CDMA Evolution-Data Optimized (originally Data Only, 1xEDVO, also known as CDMA2000 1x EV-DO, or 1x EVDO) data service. */
  @js.native
  sealed trait cdma1xEvdo
    extends StObject
       with WwanDataClass
  
  /** The network provides 1xEVDO RevA data service. */
  @js.native
  sealed trait cdma1xEvdoRevA
    extends StObject
       with WwanDataClass
  
  /** The network provides 1xEVDO RevB data service. */
  @js.native
  sealed trait cdma1xEvdoRevB
    extends StObject
       with WwanDataClass
  
  /** The network provides CDMA Evolution-Data/Voice (also known as CDMA 2000 1x EV-DV, or 1x EVDV) data service is supported. */
  @js.native
  sealed trait cdma1xEvdv
    extends StObject
       with WwanDataClass
  
  /** The network provides CDMA 1x Radio Transmission Technology (1xRTT) data service. */
  @js.native
  sealed trait cdma1xRtt
    extends StObject
       with WwanDataClass
  
  /** The network provides CDMA 3x Radio Transmission Technology (3xRTT) data service. */
  @js.native
  sealed trait cdma3xRtt
    extends StObject
       with WwanDataClass
  
  /** The network provides UMB data service. */
  @js.native
  sealed trait cdmaUmb
    extends StObject
       with WwanDataClass
  
  /** The network provides a data service not listed in this table. */
  @js.native
  sealed trait custom
    extends StObject
       with WwanDataClass
  
  /** The network provides Enhanced Data for Global Evolution (EDGE). */
  @js.native
  sealed trait edge
    extends StObject
       with WwanDataClass
  
  /** The network provides General Packet Radio Service (GPRS) data service. */
  @js.native
  sealed trait gprs
    extends StObject
       with WwanDataClass
  
  /** The network provides High-Speed Downlink Packet Access (HSDPA) data service. */
  @js.native
  sealed trait hsdpa
    extends StObject
       with WwanDataClass
  
  /** The network provides High-Speed Uplink Packet Access (HSUPA) data service. */
  @js.native
  sealed trait hsupa
    extends StObject
       with WwanDataClass
  
  /** The network provides LTE Advanced data service. */
  @js.native
  sealed trait lteAdvanced
    extends StObject
       with WwanDataClass
  
  /** The network does not provide a data service. */
  @js.native
  sealed trait none
    extends StObject
       with WwanDataClass
  
  /** The network provides Universal Mobile Telecommunications System (UMTS) data service. */
  @js.native
  sealed trait umts
    extends StObject
       with WwanDataClass
}
