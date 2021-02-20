package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjFieldGroup (currently only supported on nlobjAssistant pages)
  *
  * @classDescription object used for grouping fields on pages (currently only supported on assistant pages).
  * @return {nlobjFieldGroup}
  * @constructor
  *
  * @since 2009.2
  */
@js.native
trait nlobjFieldGroup
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * set collapsibility property for this field group.
    *
    * @param {boolean} collapsible if true then this field group is collapsible
    * @param {boolean} [defaultcollapsed] if true and the field group is collapsible, collapse this field group by default
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjFieldGroup
    *
    * @since 2009.2
    * @param collapsible
    * @param defaultcollapsed?
    * @return
    */
  def setCollapsible(collapsible: Boolean): js.Function0[Unit] = js.native
  def setCollapsible(collapsible: Boolean, defaultcollapsed: Boolean): js.Function0[Unit] = js.native
  
  /**
    * set the label for this field group.
    * @param {string} label display label for field group
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjFieldGroup
    *
    * @since 2009.2
    * @param label
    * @return
    */
  def setLabel(label: String): js.Function0[Unit] = js.native
  
  /**
    * set showBorder property for this field group.
    *
    * @param {boolean} showBorder if true then this field group shows border including label of group
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjFieldGroup
    *
    * @since 2011.1
    * @param showBorder
    * @return
    */
  def setShowBorder(showBorder: Boolean): js.Function0[Unit] = js.native
  
  /**
    * set singleColumn property for this field group.
    *
    * @param {boolean} singleColumn if true then this field group is displayed in single column
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjFieldGroup
    *
    * @since 2011.1
    * @param singleColumn
    * @return
    */
  def setSingleColumn(singleColumn: Boolean): js.Function0[Unit] = js.native
}
