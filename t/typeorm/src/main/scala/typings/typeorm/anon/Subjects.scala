package typings.typeorm.anon

import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subjects extends StObject {
  
  var subjects: js.Array[Subject]
  
  var target: js.Function | String
}
object Subjects {
  
  @scala.inline
  def apply(subjects: js.Array[Subject], target: js.Function | String): Subjects = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subjects]
  }
  
  @scala.inline
  implicit class SubjectsMutableBuilder[Self <: Subjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
