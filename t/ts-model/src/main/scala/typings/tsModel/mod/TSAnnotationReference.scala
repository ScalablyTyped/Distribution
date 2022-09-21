package typings.tsModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tsModel.mod.IAnnotationReference because var conflicts: name. Inlined values, value */ @JSImport("ts-model", "TSAnnotationReference")
@js.native
open class TSAnnotationReference protected () extends TSSimpleTypeReference {
  def this(p: TSModelElement[Any], tn: String) = this()
  def this(p: TSModelElement[Any], tn: String, values: StringDictionary[Value]) = this()
  
  def value(): Value = js.native
  def value(key: String): Value = js.native
  
  var values: StringDictionary[Value] = js.native
}
