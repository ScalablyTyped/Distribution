package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** A category within a classifier. */
trait Class extends StObject {
  
  /** The name of the class. */
  var class_name: String
}
object Class {
  
  @scala.inline
  def apply(class_name: String): Class = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
  }
}
