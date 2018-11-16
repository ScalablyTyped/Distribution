package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastParser extends js.Object {
  /**
       * Add the replace function at the end of the URLTemplateFilters array.
       * All functions in URLTemplateFilters will be called with the VAST URL as parameter before fetching the VAST URL document.
       */
  def addURLTemplateFilter(cb: js.Function1[/* vastUrl */ java.lang.String, java.lang.String]): scala.Unit = js.native
  /**
       * Reset URLTemplateFilters to empty, previous replace function set with addURLTemplateFilter() are no longer called.
       */
  def clearUrlTemplateFilters(): scala.Unit = js.native
  /**
       * Returns how many replace function are set (ie: URLTemplateFilters length)
       */
  def countURLTemplateFilters(): scala.Double = js.native
  /**
       * Parse an VAST xml, resolve any wrappers and execute callback function done
       *
       * String XMLDocument – A VAST XML document.
       * Object options – An optional set of key/value to configure the Ajax request:
       *      Object urlhandler – A URL handler module, used to fetch VASTAdTagURI URL. If defined, will be used instead of the default ones.
       *      Boolean withCredentials – A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers.
       *      Number wrapperLimit – A number of available Wrapper responses that can be received with no InLine response.
       * Function done – Method to be called once the VAST document is parsed. When at least 1 valid <inline> has been found, the 1st parameter will be an array of VASTAd instances.
       * Hoverwise, in case of no ads, it will be null, and an error as a 2nd parameter is provided.
       */
  def load(
    xml: java.lang.String,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def load(
    xml: java.lang.String,
    options: VastRequestOptions,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Remove the specified listener for the event named eventName.
       */
  def off(eventName: java.lang.String, listener: js.Function1[/* error */ VastError, scala.Unit]): scala.Unit = js.native
  /**
       * Add the listener function for the event named eventName. eventName value can be :
       *
       * String VAST-error – emitted when the parser encountered a VAST error (ie: no ads, warapper timeout...).
       * The VAST error code is passed to the listener function as a parameter.
       */
  def on(eventName: java.lang.String, listener: js.Function1[/* error */ VastError, scala.Unit]): scala.Unit = js.native
  /**
       * Add a one time listener function for the event named eventName.
       */
  def once(eventName: java.lang.String, listener: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
       * Fetch a URL and parse the response into a valid VAST object.
       *
       * String url – The VAST XML document URL to fetch.
       * Object options – An optional set of key/value to configure the Ajax request:
       *      Object urlhandler – A URL handler module, used to fetch the VAST document instead of the default ones.
       *      Boolean withCredentials – A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers.
       *      Number wrapperLimit – A number of available Wrapper responses that can be received with no InLine response.
       * Function done – Method to be called once the VAST document is parsed. When at least 1 valid <inline> has been found, the 1st parameter will be an array of VASTAd instances.
       * Hoverwise, in case of no ads, it will be null, and an error as a 2nd parameter is provided.
       */
  def parse(
    url: java.lang.String,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def parse(
    url: java.lang.String,
    options: VastRequestOptions,
    done: js.Function2[/* response */ VastResponse, /* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Remove replace function from URLTemplateFilters array.
       * Replace function won't be called on the next VAST URL encountred by the parser.
       */
  def removeURLTemplateFilter(cb: js.Function1[/* vastUrl */ java.lang.String, java.lang.String]): scala.Unit = js.native
}

