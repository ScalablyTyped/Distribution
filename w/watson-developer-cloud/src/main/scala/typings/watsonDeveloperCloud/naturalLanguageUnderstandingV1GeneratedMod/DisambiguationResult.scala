package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Disambiguation information for the entity. */
trait DisambiguationResult extends StObject {
  
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.undefined
  
  /** Common entity name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Entity subtype information. */
  var subtype: js.UndefOr[js.Array[String]] = js.undefined
}
object DisambiguationResult {
  
  @scala.inline
  def apply(): DisambiguationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisambiguationResult]
  }
  
  @scala.inline
  implicit class DisambiguationResultMutableBuilder[Self <: DisambiguationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbpedia_resource(value: String): Self = StObject.set(x, "dbpedia_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbpedia_resourceUndefined: Self = StObject.set(x, "dbpedia_resource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubtype(value: js.Array[String]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setSubtypeVarargs(value: String*): Self = StObject.set(x, "subtype", js.Array(value :_*))
  }
}
