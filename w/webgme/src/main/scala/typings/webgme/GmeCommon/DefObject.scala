package typings.webgme.GmeCommon

import typings.webgme.webgmeStrings.asset
import typings.webgme.webgmeStrings.boolean
import typings.webgme.webgmeStrings.float
import typings.webgme.webgmeStrings.integer
import typings.webgme.webgmeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webgme.GmeCommon.DefStringObject
  - typings.webgme.GmeCommon.DefIntegerObject
  - typings.webgme.GmeCommon.DefFloatObject
  - typings.webgme.GmeCommon.DefBoolObject
  - typings.webgme.GmeCommon.DefAssetObject
*/
trait DefObject extends js.Object
object DefObject {
  
  @scala.inline
  def DefStringObject(`type`: string): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefIntegerObject(`type`: integer): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefBoolObject(`type`: boolean): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefAssetObject(`type`: asset): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefFloatObject(`type`: float): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
}
