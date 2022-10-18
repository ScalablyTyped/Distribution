package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeysMod.Keys
import typings.tsToolbelt.outObjectIntersectKeysMod.IntersectMatch
import typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-contains`
import typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-extends`
import typings.tsToolbelt.tsToolbeltStrings.`contains-Greaterthansign`
import typings.tsToolbelt.tsToolbeltStrings.`extends-Greaterthansign`
import typings.tsToolbelt.tsToolbeltStrings.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Equals[O /* <: js.Object */, O1 /* <: js.Object */] extends StObject {
  
  var default: Keys[O] & Keys[O1]
  
  @JSName("<-contains")
  var `Lessthansign-contains`: IntersectMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-contains`]
  
  @JSName("<-extends")
  var `Lessthansign-extends`: IntersectMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`Lessthansign-extends`]
  
  @JSName("contains->")
  var `contains-Greaterthansign`: IntersectMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`contains-Greaterthansign`]
  
  @JSName("equals")
  var equals_FEquals: IntersectMatch[O, O1, equals]
  
  @JSName("extends->")
  var `extends-Greaterthansign`: IntersectMatch[O, O1, typings.tsToolbelt.tsToolbeltStrings.`extends-Greaterthansign`]
}
object Equals {
  
  inline def apply[O /* <: js.Object */, O1 /* <: js.Object */](
    `Lessthansign-contains`: IntersectMatch[O, O1, `Lessthansign-contains`],
    `Lessthansign-extends`: IntersectMatch[O, O1, `Lessthansign-extends`],
    `contains-Greaterthansign`: IntersectMatch[O, O1, `contains-Greaterthansign`],
    default: Keys[O] & Keys[O1],
    equals_ : IntersectMatch[O, O1, equals],
    `extends-Greaterthansign`: IntersectMatch[O, O1, `extends-Greaterthansign`]
  ): Equals[O, O1] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("<-contains")(`Lessthansign-contains`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-extends")(`Lessthansign-extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("contains->")(`contains-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.updateDynamic("extends->")(`extends-Greaterthansign`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equals[O, O1]]
  }
  
  extension [Self <: Equals[?, ?], O /* <: js.Object */, O1 /* <: js.Object */](x: Self & (Equals[O, O1])) {
    
    inline def `setContains-Greaterthansign`(value: IntersectMatch[O, O1, `contains-Greaterthansign`]): Self = StObject.set(x, "contains->", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Keys[O] & Keys[O1]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: IntersectMatch[O, O1, equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def `setExtends-Greaterthansign`(value: IntersectMatch[O, O1, `extends-Greaterthansign`]): Self = StObject.set(x, "extends->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-contains`(value: IntersectMatch[O, O1, `Lessthansign-contains`]): Self = StObject.set(x, "<-contains", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-extends`(value: IntersectMatch[O, O1, `Lessthansign-extends`]): Self = StObject.set(x, "<-extends", value.asInstanceOf[js.Any])
  }
}
