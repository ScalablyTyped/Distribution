package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataClasses extends StObject
/** Describes the cellular data services supported by a mobile broadband network device. */
@JSGlobal("Windows.Networking.NetworkOperators.DataClasses")
@js.native
object DataClasses extends StObject {
  
  /** The device supports the 1xEV-DO data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdo
    extends StObject
       with DataClasses
  
  /** The device supports the 1xEV-DO RevA data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdoRevA
    extends StObject
       with DataClasses
  
  /** The device supports the 1xEV-DO RevB data service, which is identified for future use. */
  @js.native
  sealed trait cdma1xEvdoRevB
    extends StObject
       with DataClasses
  
  /** The device supports the 1xEV-DV data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdv
    extends StObject
       with DataClasses
  
  /** The device supports the 1xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xRtt
    extends StObject
       with DataClasses
  
  /** The device supports the 3xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma3xRtt
    extends StObject
       with DataClasses
  
  /** The device supports the UMB data service implemented by CDMA providers. */
  @js.native
  sealed trait cdmaUmb
    extends StObject
       with DataClasses
  
  /** The device supports a custom data service. */
  @js.native
  sealed trait custom
    extends StObject
       with DataClasses
  
  /** The device supports the EDGE data service implemented by GSM providers. */
  @js.native
  sealed trait edge
    extends StObject
       with DataClasses
  
  /** The device supports the GPRS data service implemented by GSM providers. */
  @js.native
  sealed trait gprs
    extends StObject
       with DataClasses
  
  /** The device supports the HSDPA data service implemented by GSM providers. */
  @js.native
  sealed trait hsdpa
    extends StObject
       with DataClasses
  
  /** The device supports the HSUPA (High Speed Uplink Packet Access) data service. */
  @js.native
  sealed trait hsupa
    extends StObject
       with DataClasses
  
  /** The device supports the HSDPA Lite data service implemented by GSM providers. */
  @js.native
  sealed trait lteAdvanced
    extends StObject
       with DataClasses
  
  /** No data services supported. */
  @js.native
  sealed trait none
    extends StObject
       with DataClasses
  
  /** The device supports the UMTS data service implemented by GSM providers. */
  @js.native
  sealed trait umts
    extends StObject
       with DataClasses
}
