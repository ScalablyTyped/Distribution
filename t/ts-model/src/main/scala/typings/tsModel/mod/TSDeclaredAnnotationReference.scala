package typings.tsModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tsModel.mod.IAnnotationReference because var conflicts: name. Inlined values, value */ @JSImport("ts-model", "TSDeclaredAnnotationReference")
@js.native
open class TSDeclaredAnnotationReference protected () extends TSDeclaredInterfaceReference {
  def this(p: TSModelElement[Any], tn: String, _data: TSInterface) = this()
  
  def value(): Value = js.native
  def value(key: String): Value = js.native
  
  var values: StringDictionary[Value] = js.native
}
