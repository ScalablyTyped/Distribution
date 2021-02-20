package typings.xrm.XrmEnum

import typings.xrm.xrmNumbers.`0`
import typings.xrm.xrmNumbers.`11`
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import typings.xrm.xrmNumbers.`3`
import typings.xrm.xrmNumbers.`4`
import typings.xrm.xrmNumbers.`5`
import typings.xrm.xrmNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumeration of entity form states/types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`0`
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
  - typings.xrm.xrmNumbers.`3`
  - typings.xrm.xrmNumbers.`4`
  - typings.xrm.xrmNumbers.`6`
  - typings.xrm.xrmNumbers.`5`
  - typings.xrm.xrmNumbers.`11`
*/
trait FormType extends StObject
object FormType {
  
  @scala.inline
  def BulkEdit: `6` = 6.asInstanceOf[`6`]
  
  @scala.inline
  def Create: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def Disabled: `4` = 4.asInstanceOf[`4`]
  
  /**
    * @deprecated QuickCreate has been deprecated
    */
  @scala.inline
  def QuickCreate: `5` = 5.asInstanceOf[`5`]
  
  @scala.inline
  def ReadOnly: `3` = 3.asInstanceOf[`3`]
  
  /**
    * @deprecated ReadOptimized has been deprecated.
    */
  @scala.inline
  def ReadOptimized: `11` = 11.asInstanceOf[`11`]
  
  @scala.inline
  def Undefined: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def Update: `2` = 2.asInstanceOf[`2`]
}
