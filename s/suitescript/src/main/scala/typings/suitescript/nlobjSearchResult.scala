package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjSearchResult used for search result row object.
  *
  * @classDescription Class definition for interacting with the results of a search operation
  * @return {nlobjSearchResult}
  */
@js.native
trait nlobjSearchResult
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[Any] {
  
  /**
    * return an array of all nlobjSearchColumn objects returned in this search.
    * @return {nlobjSearchColumn[]}
    *
    * @method
    *
    * @since 2009.2
    */
  def getAllColumns(): Unit = js.native
  
  /**
    * return the internalId for the record returned in this row.
    * @method
    * @return {int}
    * @return
    */
  def getId(): Any = js.native
  
  /**
    * return the recordtype for the record returned in this row.
    * @method
    * @return {string}
    * @return
    */
  def getRecordType(): String = js.native
  
  /**
    * return the text value of this return column if it's a select field.
    * @param {string} name the name of the search column
    * @param {string} join the join ID for the search column
    * @param {string} summary summary type specified for this column
    * @return {string}
    *
    * @method
    *
    * @since 2008.1
    * @param name
    * @param join
    * @param summary
    * @return
    */
  def getText(name: String, join: String, summary: String): String = js.native
  
  /**
    * return the value for a return column specified by name, join ID, and summary type.
    * @param {string} name the name of the search column
    * @param {string} join the join ID for the search column
    * @param {string} summary summary type specified for this column
    * @return {string}
    *
    * @method
    *
    * @since 2008.1
    * @param name
    * @param join
    * @param summary
    * @return
    */
  def getValue(name: String, join: String, summary: String): String = js.native
}
