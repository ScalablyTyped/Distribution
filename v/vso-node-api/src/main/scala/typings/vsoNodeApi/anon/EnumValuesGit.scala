package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesGit extends StObject {
  
  var enumValues: Git
}
object EnumValuesGit {
  
  @scala.inline
  def apply(enumValues: Git): EnumValuesGit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGit]
  }
  
  @scala.inline
  implicit class EnumValuesGitMutableBuilder[Self <: EnumValuesGit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Git): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
