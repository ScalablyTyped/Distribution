package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjTab used for scriptable tab or subtab.
  *
  * @classDescription high level grouping for fields on a data entry form (nlobjForm).
  * @return {nlobjTab}
  * @constructor
  */
@js.native
trait nlobjTab
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * set helper text for this tab or subtab.
    *
    * @param {string} help inline help text used for this tab or subtab
    * @return {nlobjTab}
    *
    * @since 2008.2
    * @param help
    * @return
    */
  def setHelpText(help: String): js.Function0[Unit] = js.native
  
  /**
    * set the label for this tab or subtab.
    *
    * @param {string} label string used as label for this tab or subtab
    * @return {nlobjTab}
    *
    * @since 2008.2
    * @param label
    * @return
    */
  def setLabel(label: String): js.Function0[Unit] = js.native
}
