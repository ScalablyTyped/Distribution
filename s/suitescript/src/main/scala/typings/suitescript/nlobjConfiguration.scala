package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjConfiguration..
  *
  * @classDescription Class definition for interacting with setup/configuration pages
  * @return {nlobjConfiguration}
  * @constructor
  *
  * @since 2009.2
  */
@js.native
trait nlobjConfiguration
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  /**
    * return an Array of all field names on the record.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    */
  def getAllFields(): js.Array[String] = js.native
  /**
    * return field metadata for field.
    *
    * @param {string} fldnam field name
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param fldnam
    * @return
    */
  def getField(fldnam: String): js.Function0[Unit] = js.native
  /**
    * return the text value of a field.
    * @restriction only supported for select fields
    *
    * @param {string} name field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getFieldText(name: String): String = js.native
  /**
    * return the selected text values of a multi-select field as an Array.
    * @param {string} name field name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    */
  def getFieldTexts(name: String): Unit = js.native
  /**
    * return the value of a field.
    *
    * @param {string} name field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getFieldValue(name: String): String = js.native
  /**
    * return the selected values of a multi-select field as an Array.
    * @restriction only supported for multi-select fields
    *
    * @param {string} name field name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    */
  def getFieldValues(name: String): js.Array[String] = js.native
  /**
    * return the type corresponding to this setup record.
    *
    * @return {string}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @return
    */
  def getType(): String = js.native
  /**
    * set the value (via display value) of a field.
    * @restriction only supported for select fields
    *
    * @param {string} name field name
    * @param {string} text field display text
    * @return {void}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @param text
    * @return
    */
  def setFieldText(name: String, text: String): js.Any = js.native
  /**
    * set the values (via display values) of a multi-select field.
    * @restriction only supported for multi-select fields
    *
    * @param {string}     name field name
    * @param {string[]} texts array of field display text values
    * @return {void}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @param texts
    * @return
    */
  def setFieldTexts(name: String, texts: js.Any): js.Any = js.native
  /**
    * set the value of a field.
    *
    * @param {string} name field name
    * @param {string} value field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @param value
    * @return
    */
  def setFieldValue(name: String, value: String): js.Any = js.native
  /**
    * Set the values of a multi-select field.
    * @restriction only supported for multi-select fields
    *
    * @param {string} name field name
    * @param {string[]} value field values
    * @return {void}
    *
    * @method
    * @memberOf nlobjConfiguration
    *
    * @since 2009.2
    * @param name
    * @param value
    * @return
    */
  def setFieldValues(name: String, value: js.Any): js.Any = js.native
}

