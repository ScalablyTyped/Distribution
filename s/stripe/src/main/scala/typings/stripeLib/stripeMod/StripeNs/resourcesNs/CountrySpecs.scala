package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountrySpecs
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def list(): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.IListOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  /**
               * Lists all Country Spec objects available in the API.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  /**
               * Lists all Country Spec objects available in the API.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
    ]
  ): stdLib.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ] = js.native
  def retrieve(id: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  /**
               * Returns a Country Spec for a given Country code.
               *
               * @param retrieve  An ISO country code. Available country codes can be listed with the List Country Specs endpoint.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  /**
               * Returns a Country Spec for a given Country code.
               *
               * @param retrieve  An ISO country code. Available country codes can be listed with the List Country Specs endpoint.
               */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.countrySpecsNs.ICountrySpec] = js.native
}

