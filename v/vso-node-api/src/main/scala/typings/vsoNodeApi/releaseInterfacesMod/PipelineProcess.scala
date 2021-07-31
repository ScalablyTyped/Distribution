package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineProcess extends StObject {
  
  var `type`: PipelineProcessTypes
}
object PipelineProcess {
  
  @scala.inline
  def apply(`type`: PipelineProcessTypes): PipelineProcess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineProcess]
  }
  
  @scala.inline
  implicit class PipelineProcessMutableBuilder[Self <: PipelineProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PipelineProcessTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
