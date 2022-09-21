package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[Any] {
  
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
  def getId(): String = js.native
  
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
  def getText(): String = js.native
}
