package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object representing a place, returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
trait GeocodedAddress extends js.Object {
  /**
    * Full address.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * City name.
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Country name.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Latitude of the geocoded point.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * Longitude of the geocoded point.
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * Postal code
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * First line of region.
    */
  var region1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Not used.
    */
  var region2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Street name, without street address.
    */
  var street: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Street name.
    */
  var street1: js.UndefOr[java.lang.String] = js.undefined
}

object GeocodedAddress {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    postalCode: java.lang.String = null,
    region1: java.lang.String = null,
    region2: java.lang.String = null,
    street: java.lang.String = null,
    street1: java.lang.String = null
  ): GeocodedAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region1 != null) __obj.updateDynamic("region1")(region1.asInstanceOf[js.Any])
    if (region2 != null) __obj.updateDynamic("region2")(region2.asInstanceOf[js.Any])
    if (street != null) __obj.updateDynamic("street")(street.asInstanceOf[js.Any])
    if (street1 != null) __obj.updateDynamic("street1")(street1.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodedAddress]
  }
}

