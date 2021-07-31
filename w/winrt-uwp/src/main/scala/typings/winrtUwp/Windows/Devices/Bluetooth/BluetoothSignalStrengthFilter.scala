package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Groups parameters used to configure received signal strength indicator (RSSI)-based filtering. */
trait BluetoothSignalStrengthFilter extends StObject {
  
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be propagated or considered in range if the previous events were considered out of range. */
  var inRangeThresholdInDBm: Double
  
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be considered out of range. */
  var outOfRangeThresholdInDBm: Double
  
  /** The timeout for a received signal strength indicator (RSSI) event to be considered out of range. */
  var outOfRangeTimeout: Double
  
  /** The interval at which received signal strength indicator (RSSI) events are sampled. */
  var samplingInterval: Double
}
object BluetoothSignalStrengthFilter {
  
  @scala.inline
  def apply(
    inRangeThresholdInDBm: Double,
    outOfRangeThresholdInDBm: Double,
    outOfRangeTimeout: Double,
    samplingInterval: Double
  ): BluetoothSignalStrengthFilter = {
    val __obj = js.Dynamic.literal(inRangeThresholdInDBm = inRangeThresholdInDBm.asInstanceOf[js.Any], outOfRangeThresholdInDBm = outOfRangeThresholdInDBm.asInstanceOf[js.Any], outOfRangeTimeout = outOfRangeTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothSignalStrengthFilter]
  }
  
  @scala.inline
  implicit class BluetoothSignalStrengthFilterMutableBuilder[Self <: BluetoothSignalStrengthFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInRangeThresholdInDBm(value: Double): Self = StObject.set(x, "inRangeThresholdInDBm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfRangeThresholdInDBm(value: Double): Self = StObject.set(x, "outOfRangeThresholdInDBm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfRangeTimeout(value: Double): Self = StObject.set(x, "outOfRangeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
  }
}
