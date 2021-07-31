package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultUpdateResponseModel extends StObject {
  
  var revision: Double
}
object ResultUpdateResponseModel {
  
  @scala.inline
  def apply(revision: Double): ResultUpdateResponseModel = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultUpdateResponseModel]
  }
  
  @scala.inline
  implicit class ResultUpdateResponseModelMutableBuilder[Self <: ResultUpdateResponseModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
