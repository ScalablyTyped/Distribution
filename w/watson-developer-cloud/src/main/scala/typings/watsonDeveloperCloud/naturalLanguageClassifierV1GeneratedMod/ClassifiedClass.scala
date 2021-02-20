package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class and confidence. */
@js.native
trait ClassifiedClass extends StObject {
  
  /** Class label. */
  var class_name: js.UndefOr[String] = js.native
  
  /** A decimal percentage that represents the confidence that Watson has in this class. Higher values represent higher confidences. */
  var confidence: js.UndefOr[Double] = js.native
}
object ClassifiedClass {
  
  @scala.inline
  def apply(): ClassifiedClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifiedClass]
  }
  
  @scala.inline
  implicit class ClassifiedClassMutableBuilder[Self <: ClassifiedClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass_nameUndefined: Self = StObject.set(x, "class_name", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
