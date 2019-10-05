package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  
  /* 8 */ val cdma1xEvdo: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdo with Double = js.native
  /* 9 */ val cdma1xEvdoRevA: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevA with Double = js.native
  /* 12 */ val cdma1xEvdoRevB: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevB with Double = js.native
  /* 10 */ val cdma1xEvdv: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdv with Double = js.native
  /* 7 */ val cdma1xRtt: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma1xRtt with Double = js.native
  /* 11 */ val cdma3xRtt: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdma3xRtt with Double = js.native
  /* 13 */ val cdmaUmb: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.cdmaUmb with Double = js.native
  /* 14 */ val custom: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.custom with Double = js.native
  /* 2 */ val edge: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.edge with Double = js.native
  /* 1 */ val gprs: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.gprs with Double = js.native
  /* 4 */ val hsdpa: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.hsdpa with Double = js.native
  /* 5 */ val hsupa: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.hsupa with Double = js.native
  /* 6 */ val lteAdvanced: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.lteAdvanced with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.none with Double = js.native
  /* 3 */ val umts: typings.winrtDashUwp.Windows.Networking.NetworkOperators.DataClasses.umts with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataClasses with Double] = js.native
}

