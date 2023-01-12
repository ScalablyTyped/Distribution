package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeysMod.Keys
import typings.tsToolbelt.outObjectExcludeKeysMod.ExcludeMatch
import typings.tsToolbelt.outUnionExcludeMod.Exclude
import typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-contains`
import typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-extends`
import typings.tsToolbelt.tsToolbeltStrings.`contains-Greaterthansign`
import typings.tsToolbelt.tsToolbeltStrings.`extends-Greaterthansign`
import typings.tsToolbelt.tsToolbeltStrings.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[O /* <: js.Object */, O1 /* <: js.Object */] extends StObject {
  
  var default: Exclude[Keys[O], Keys[O1]]
  
  @JSName("<-contains")
  var `Lessthansign-contains`: ExcludeMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-contains`]
  
  @JSName("<-extends")
  var `Lessthansign-extends`: ExcludeMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-extends`]
  
  @JSName("contains->")
  var `contains-Greaterthansign`: ExcludeMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`contains-Greaterthansign`]
  
  @JSName("equals")
  var equals_FDefault: ExcludeMatch[O, O1, equals]
  
  @JSName("extends->")
  var `extends-Greaterthansign`: ExcludeMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`extends-Greaterthansign`]
}
object Default {
  
  inline def apply[O /* <: js.Object */, O1 /* <: js.Object */](
    `Lessthansign-contains`: ExcludeMatch[O, O1, `Lessthansign-contains`],
    `Lessthansign-extends`: ExcludeMatch[O, O1, `Lessthansign-extends`],
    `contains-Greaterthansign`: ExcludeMatch[O, O1, `contains-Greaterthansign`],
    default: Exclude[Keys[O], Keys[O1]],
    equals_ : ExcludeMatch[O, O1, equals],
    `extends-Greaterthansign`: ExcludeMatch[O, O1, `extends-Greaterthansign`]
  ): Default[O, O1] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("<-contains")(`Lessthansign-contains`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-extends")(`Lessthansign-extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("contains->")(`contains-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.updateDynamic("extends->")(`extends-Greaterthansign`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[O, O1]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default[?, ?], O /* <: js.Object */, O1 /* <: js.Object */] (val x: Self & (Default[O, O1])) extends AnyVal {
    
    inline def `setContains-Greaterthansign`(value: ExcludeMatch[O, O1, `contains-Greaterthansign`]): Self = StObject.set(x, "contains->", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Exclude[Keys[O], Keys[O1]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: ExcludeMatch[O, O1, equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def `setExtends-Greaterthansign`(value: ExcludeMatch[O, O1, `extends-Greaterthansign`]): Self = StObject.set(x, "extends->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-contains`(value: ExcludeMatch[O, O1, `Lessthansign-contains`]): Self = StObject.set(x, "<-contains", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-extends`(value: ExcludeMatch[O, O1, `Lessthansign-extends`]): Self = StObject.set(x, "<-extends", value.asInstanceOf[js.Any])
  }
}
