package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskVersion extends StObject {
  
  var isTest: Boolean
  
  var major: Double
  
  var minor: Double
  
  var patch: Double
}
object TaskVersion {
  
  @scala.inline
  def apply(isTest: Boolean, major: Double, minor: Double, patch: Double): TaskVersion = {
    val __obj = js.Dynamic.literal(isTest = isTest.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskVersion]
  }
  
  @scala.inline
  implicit class TaskVersionMutableBuilder[Self <: TaskVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTest(value: Boolean): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
