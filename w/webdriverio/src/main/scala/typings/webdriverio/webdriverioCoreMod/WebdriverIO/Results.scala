package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var failed: Double
  
  var finished: Double
  
  var passed: Double
}
object Results {
  
  @scala.inline
  def apply(failed: Double, finished: Double, passed: Double): Results = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
  }
}
