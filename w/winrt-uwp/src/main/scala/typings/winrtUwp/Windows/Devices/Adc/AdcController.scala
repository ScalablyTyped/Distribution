package typings.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ADC controller on the system */
@js.native
trait AdcController extends js.Object {
  
  /** The number of channels available on the ADC controller. */
  var channelCount: Double = js.native
  
  /** Gets or sets the channel mode for the ADC controller. */
  var channelMode: AdcChannelMode = js.native
  
  /**
    * Verifies that the specified channel mode is supported by the controller.
    * @param channelMode The channel mode.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: AdcChannelMode): Boolean = js.native
  
  /** Gets the maximum value that the controller can report. */
  var maxValue: Double = js.native
  
  /** The minimum value the controller can report. */
  var minValue: Double = js.native
  
  /**
    * Opens a connection to the specified ADC channel.
    * @param channelNumber The channel to connect to.
    * @return The ADC channel.
    */
  def openChannel(channelNumber: Double): AdcChannel = js.native
  
  /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
  var resolutionInBits: Double = js.native
}
object AdcController {
  
  @scala.inline
  def apply(
    channelCount: Double,
    channelMode: AdcChannelMode,
    isChannelModeSupported: AdcChannelMode => Boolean,
    maxValue: Double,
    minValue: Double,
    openChannel: Double => AdcChannel,
    resolutionInBits: Double
  ): AdcController = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], openChannel = js.Any.fromFunction1(openChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdcController]
  }
  
  @scala.inline
  implicit class AdcControllerOps[Self <: AdcController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMode(value: AdcChannelMode): Self = this.set("channelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChannelModeSupported(value: AdcChannelMode => Boolean): Self = this.set("isChannelModeSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenChannel(value: Double => AdcChannel): Self = this.set("openChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolutionInBits(value: Double): Self = this.set("resolutionInBits", value.asInstanceOf[js.Any])
  }
}
