package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCommit extends StObject {
  
  var enumValues: Commit
}
object EnumValuesCommit {
  
  @scala.inline
  def apply(enumValues: Commit): EnumValuesCommit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCommit]
  }
  
  @scala.inline
  implicit class EnumValuesCommitMutableBuilder[Self <: EnumValuesCommit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Commit): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
