package typings.treat.typesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreatModuleObject
  extends /* index */ NumberDictionary[TreatModuleValue]
     with /* index */ StringDictionary[TreatModuleValue]
     with TreatModule
     with _TreatModuleValue
object TreatModuleObject {
  
  @scala.inline
  def apply(): TreatModuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreatModuleObject]
  }
}
