package typings.tsToolbelt.anon

import typings.tsToolbelt.extendsMod.Extends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains[A /* <: Any */, A1 /* <: Any */] extends StObject {
  
  var default: Extends[A, A1]
  
  @JSName("<-contains")
  var `Lessthansign-contains`: typings.tsToolbelt.containsMod.Contains[A1, A]
  
  @JSName("<-extends")
  var `Lessthansign-extends`: Extends[A1, A]
  
  @JSName("contains->")
  var `contains-Greaterthansign`: typings.tsToolbelt.containsMod.Contains[A, A1]
  
  @JSName("equals")
  var equals_FContains: typings.tsToolbelt.equalsMod.Equals[A1, A]
  
  @JSName("extends->")
  var `extends-Greaterthansign`: Extends[A, A1]
}
object Contains {
  
  inline def apply[A /* <: Any */, A1 /* <: Any */](
    `Lessthansign-contains`: typings.tsToolbelt.containsMod.Contains[A1, A],
    `Lessthansign-extends`: Extends[A1, A],
    `contains-Greaterthansign`: typings.tsToolbelt.containsMod.Contains[A, A1],
    default: Extends[A, A1],
    equals_ : typings.tsToolbelt.equalsMod.Equals[A1, A],
    `extends-Greaterthansign`: Extends[A, A1]
  ): Contains[A, A1] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("<-contains")(`Lessthansign-contains`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-extends")(`Lessthansign-extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("contains->")(`contains-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.updateDynamic("extends->")(`extends-Greaterthansign`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains[A, A1]]
  }
  
  extension [Self <: Contains[?, ?], A /* <: Any */, A1 /* <: Any */](x: Self & (Contains[A, A1])) {
    
    inline def `setContains-Greaterthansign`(value: typings.tsToolbelt.containsMod.Contains[A, A1]): Self = StObject.set(x, "contains->", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Extends[A, A1]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: typings.tsToolbelt.equalsMod.Equals[A1, A]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def `setExtends-Greaterthansign`(value: Extends[A, A1]): Self = StObject.set(x, "extends->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-contains`(value: typings.tsToolbelt.containsMod.Contains[A1, A]): Self = StObject.set(x, "<-contains", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-extends`(value: Extends[A1, A]): Self = StObject.set(x, "<-extends", value.asInstanceOf[js.Any])
  }
}
