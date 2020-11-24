package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data from the recently swiped card. */
@js.native
trait MagneticStripeReaderReport extends js.Object {
  
  /** Gets the additional security or encryption information for the recently swiped card. */
  var additionalSecurityInformation: IBuffer = js.native
  
  /** Gets the card authentication information for the recently swiped card. */
  var cardAuthenticationData: IBuffer = js.native
  
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  var cardAuthenticationDataLength: Double = js.native
  
  /** Gets the card type identifier for the recently swiped card. */
  var cardType: Double = js.native
  
  /** Gets a dictionary of properties for the recently swiped card. */
  var properties: IMapView[String, String] = js.native
  
  /** Gets the track data for Track 1. */
  var track1: MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 2. */
  var track2: MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 3. */
  var track3: MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 4. */
  var track4: MagneticStripeReaderTrackData = js.native
}
object MagneticStripeReaderReport {
  
  @scala.inline
  def apply(
    additionalSecurityInformation: IBuffer,
    cardAuthenticationData: IBuffer,
    cardAuthenticationDataLength: Double,
    cardType: Double,
    properties: IMapView[String, String],
    track1: MagneticStripeReaderTrackData,
    track2: MagneticStripeReaderTrackData,
    track3: MagneticStripeReaderTrackData,
    track4: MagneticStripeReaderTrackData
  ): MagneticStripeReaderReport = {
    val __obj = js.Dynamic.literal(additionalSecurityInformation = additionalSecurityInformation.asInstanceOf[js.Any], cardAuthenticationData = cardAuthenticationData.asInstanceOf[js.Any], cardAuthenticationDataLength = cardAuthenticationDataLength.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], track1 = track1.asInstanceOf[js.Any], track2 = track2.asInstanceOf[js.Any], track3 = track3.asInstanceOf[js.Any], track4 = track4.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderReport]
  }
  
  @scala.inline
  implicit class MagneticStripeReaderReportOps[Self <: MagneticStripeReaderReport] (val x: Self) extends AnyVal {
    
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
    def setAdditionalSecurityInformation(value: IBuffer): Self = this.set("additionalSecurityInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardAuthenticationData(value: IBuffer): Self = this.set("cardAuthenticationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardAuthenticationDataLength(value: Double): Self = this.set("cardAuthenticationDataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: Double): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack1(value: MagneticStripeReaderTrackData): Self = this.set("track1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack2(value: MagneticStripeReaderTrackData): Self = this.set("track2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack3(value: MagneticStripeReaderTrackData): Self = this.set("track3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack4(value: MagneticStripeReaderTrackData): Self = this.set("track4", value.asInstanceOf[js.Any])
  }
}
