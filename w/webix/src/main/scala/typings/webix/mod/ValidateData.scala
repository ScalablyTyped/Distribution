package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateData extends StObject {
  
  def clearValidation(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: obj): Boolean = js.native
}
object ValidateData {
  
  inline def apply: ValidateData = ^.asInstanceOf[js.Dynamic].selectDynamic("ValidateData").asInstanceOf[ValidateData]
}
