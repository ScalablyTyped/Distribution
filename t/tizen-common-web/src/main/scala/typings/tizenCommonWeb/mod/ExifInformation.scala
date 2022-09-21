package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "ExifInformation")
@js.native
open class ExifInformation () extends StObject {
  def this(ExifInitDict: ExifInit) = this()
  
  /**
    * Name of the camera manufacturer.
    */
  var deviceMaker: String | Null = js.native
  
  /**
    * Model name or model number of the camera or input device.
    */
  var deviceModel: String | Null = js.native
  
  /**
    * Exposure balance program used by the camera to set exposure when the picture was taken.
    */
  var exposureProgram: ExposureProgram | Null = js.native
  
  /**
    * Exposure time, given in seconds.
    *
    * If exposure time is below one second it is expressed as 1/x.
    * For example: 1 second exposure is "1", 0.25s is "1/4".
    */
  var exposureTime: String | Null = js.native
  
  /**
    * The f-number when the image was taken.
    *
    * Exif specification: "Conversion is not made to the focal length of a 35 mm film".
    *
    * The [f-number](http://en.wikipedia.org/wiki/F-number) is the ratio of the lens' focal length to the diameter of the entrance pupil.
    * F-number is also called focal ratio, f-ratio, f-stop, or relative aperture.
    * Example values: 1.4, 2, 2.8, 4, 5.6, 8, 11 ...
    */
  var fNumber: Double | Null = js.native
  
  /**
    * Boolean value that indicates whether flash was fired when the picture was taken (true: flash fired).
    */
  var flash: Boolean | Null = js.native
  
  /**
    * Focal length of the lens, given in mm.
    */
  var focalLength: Double | Null = js.native
  
  /**
    * Altitude (from GPS) of the camera when the picture was taken.
    *
    * This value is expressed in meters above sea level (can be negative).
    */
  var gpsAltitude: Double | Null = js.native
  
  /**
    * Latitude and longitude of the camera (from GPS) when the picture was taken.
    */
  var gpsLocation: SimpleCoordinates | Null = js.native
  
  /**
    * Name of the method used for finding the location.
    */
  var gpsProcessingMethod: String | Null = js.native
  
  /**
    * Date and time information relative to UTC (Universal Time Coordinated) provided by GPS when the photo was taken.
    */
  var gpsTime: TZDate | Null = js.native
  
  /**
    * Height of the image i.e. the number of lines in the image.
    *
    * Note if the value of this attribute is changed, the new value is not verified against the actual size of the image.
    */
  var height: Double | Null = js.native
  
  /**
    * Photo sensitivity (also called ISO speed and ISO latitude) of the camera or input device.
    *
    * Example values: 80, 100, 200, 400, 800, 1600, 3200 ..
    */
  var isoSpeedRatings: js.Array[Double] | Null = js.native
  
  /**
    * Orientation of the image when displayed.
    *
    * This attribute shows the relation between the stored image data and the visual content orientation.
    * In other words - how a stored image should be oriented when presented to the user.
    */
  var orientation: ImageContentOrientation | Null = js.native
  
  /**
    * Date and time when the picture was taken.
    */
  var originalTime: js.Date | Null = js.native
  
  /**
    * URI of the image.
    *
    * The path to the file from which _ExifInformation_ data is collected.
    */
  var uri: String = js.native
  
  /**
    * User comment.
    */
  var userComment: String | Null = js.native
  
  /**
    * White balance mode set when the picture was taken.
    */
  var whiteBalance: WhiteBalanceMode | Null = js.native
  
  /**
    * Width of the image i.e. the number of points (pixels) per image line.
    *
    * Note if the value of this attribute is changed, the new value is not verified against the actual size of the image.
    */
  var width: Double | Null = js.native
}
