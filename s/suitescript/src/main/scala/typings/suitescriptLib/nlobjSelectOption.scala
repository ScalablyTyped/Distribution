package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjSelectOption.
 *
 * @classDescription select|radio option used for building select fields via the UI Object API and for describing select|radio fields.
 * @return {nlobjSelectOption}
 * @constructor
 *
 * @since 2009.2
 */
@js.native
trait nlobjSelectOption
  extends /**
     *
     * @return
     */
ScalablyTyped.runtime.Instantiable0[js.Any] {
  /**
       * return internal ID for select option
       * @return {string}
       *
       * @method
       * @memberOf nlobjSelectOption
       *
       * @since 2009.2
       * @return
       */
  def getId(): java.lang.String = js.native
  /**
       * return display value for select option.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSelectOption
       *
       * @since 2009.2
       * @return
       */
  def getText(): java.lang.String = js.native
}

