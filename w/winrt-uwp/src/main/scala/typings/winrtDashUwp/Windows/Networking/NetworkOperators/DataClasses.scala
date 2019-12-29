package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  sealed trait cdma1xEvdo extends DataClasses
  
  /** The device supports the 1xEV-DO RevA data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdoRevA extends DataClasses
  
  /** The device supports the 1xEV-DO RevB data service, which is identified for future use. */
  @js.native
  sealed trait cdma1xEvdoRevB extends DataClasses
  
  /** The device supports the 1xEV-DV data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xEvdv extends DataClasses
  
  /** The device supports the 1xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma1xRtt extends DataClasses
  
  /** The device supports the 3xRTT data service implemented by CDMA providers. */
  @js.native
  sealed trait cdma3xRtt extends DataClasses
  
  /** The device supports the UMB data service implemented by CDMA providers. */
  @js.native
  sealed trait cdmaUmb extends DataClasses
  
  /** The device supports a custom data service. */
  @js.native
  sealed trait custom extends DataClasses
  
  /** The device supports the EDGE data service implemented by GSM providers. */
  @js.native
  sealed trait edge extends DataClasses
  
  /** The device supports the GPRS data service implemented by GSM providers. */
  @js.native
  sealed trait gprs extends DataClasses
  
  /** The device supports the HSDPA data service implemented by GSM providers. */
  @js.native
  sealed trait hsdpa extends DataClasses
  
  /** The device supports the HSUPA (High Speed Uplink Packet Access) data service. */
  @js.native
  sealed trait hsupa extends DataClasses
  
  /** The device supports the HSDPA Lite data service implemented by GSM providers. */
  @js.native
  sealed trait lteAdvanced extends DataClasses
  
  /** No data services supported. */
  @js.native
  sealed trait none extends DataClasses
  
  /** The device supports the UMTS data service implemented by GSM providers. */
  @js.native
  sealed trait umts extends DataClasses
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataClasses with Double] = js.native
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

