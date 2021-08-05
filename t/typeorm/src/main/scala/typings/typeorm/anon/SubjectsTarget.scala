package typings.typeorm.anon

import typings.typeorm.persistenceSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectsTarget extends StObject {
  
  var subjects: js.Array[Subject]
  
  var target: js.Function | String
}
object SubjectsTarget {
  
  inline def apply(subjects: js.Array[Subject], target: js.Function | String): SubjectsTarget = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectsTarget]
  }
  
  extension [Self <: SubjectsTarget](x: Self) {
    
    inline def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    
    inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
